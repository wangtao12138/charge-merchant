package cn.com.cdboost.charge.merchant.dubbo.impl;

import cn.com.cdboost.charge.base.exception.BusinessException;
import cn.com.cdboost.charge.base.util.DateUtil;
import cn.com.cdboost.charge.base.util.UuidUtil;
import cn.com.cdboost.charge.customer.vo.info.CustomerBaseInfo;
import cn.com.cdboost.charge.merchant.constant.ChargeAppConstant;
import cn.com.cdboost.charge.merchant.constant.MerchantConstant;
import cn.com.cdboost.charge.merchant.dao.MerchantInfoMapper;
import cn.com.cdboost.charge.merchant.dubbo.MerchantInfoService;
import cn.com.cdboost.charge.merchant.model.MerchantInfo;
import cn.com.cdboost.charge.merchant.service.IMerchantInfoService;
import cn.com.cdboost.charge.merchant.vo.info.MerchantInfoVo;
import cn.com.cdboost.charge.merchant.vo.param.MerchantQueryParam;
import cn.com.cdboost.charge.user.dubbo.OrgService;
import cn.com.cdboost.charge.user.dubbo.SmsService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Slf4j
@Service(version = "1.0",retries = -1,timeout = 5000)
public class MerchantInfoServiceImpl implements MerchantInfoService {
    @Resource
    private IMerchantInfoService iMerchantInfoService;

    @Reference(version = "1.0")
    private SmsService smsService;

    @Reference(version = "1.0")
    private OrgService orgService;

    @Resource
    private MerchantInfoMapper merchantInfoMapper;
    @Override
    @Transactional
    public boolean register(String phoneNumber,Integer appType,String openId, String nickName,String merchantName, String verificationCode) {
        //验证验证码是否正确
        boolean flag = smsService.verifySmsCode(phoneNumber, verificationCode);
        if (!flag) {
            // 验证码校验不通过
            return flag;
        }
        // 按手机号查询，该用户账户是否存在了
        MerchantInfo queryOaram = new MerchantInfo();
        queryOaram.setMerchantPhone(phoneNumber);
        MerchantInfo merchantInfo = iMerchantInfoService.selectOne(queryOaram);
        if (merchantInfo == null) {
            // 手机号第一次注册
            if (ChargeAppConstant.AppType.WECHAT.getType().equals(appType)) {
                MerchantInfo param = new MerchantInfo();
                param.setWebchartNo(openId);
                param.setMerchantName(merchantName);
                param.setMerchantGuid(UuidUtil.getUuid());
                param.setMerchantPhone(phoneNumber);
                param.setCreateTime(new Date());
                //TODO 暂时写死
                param.setOrgNo(1000L);
                iMerchantInfoService.insertSelective(param);
            } else {
                MerchantInfo param = new MerchantInfo();
                param.setMerchantName(merchantName);
                param.setAlipayNo(openId);
                param.setMerchantGuid(UuidUtil.getUuid());
                param.setMerchantPhone(phoneNumber);
                param.setCreateTime(new Date());
                //TODO 暂时写死
                param.setOrgNo(1000L);
                iMerchantInfoService.insertSelective(param);
            }
        } else {
            if (ChargeAppConstant.AppType.WECHAT.getType().equals(appType)) {
                if (merchantInfo.getWebchartNo().equals(openId)){
                    throw new BusinessException("用户已注册");
                }
                // 更新账户绑定微信信息
                MerchantInfo param = new MerchantInfo();
                param.setId(merchantInfo.getId());
                param.setWebchartNo(openId);
                param.setMerchantName(nickName);
                param.setUpdateTime(new Date());
                iMerchantInfoService.updateByPrimaryKeySelective(param);
            } else {
                if (merchantInfo.getAlipayNo().equals(openId)){
                    throw new BusinessException("用户已注册");
                }
                // 更新账户绑定支付宝信息
                MerchantInfo param = new MerchantInfo();
                param.setId(merchantInfo.getId());
                param.setAlipayNo(openId);
                param.setMerchantName(nickName);
                param.setUpdateTime(new Date());
                iMerchantInfoService.updateByPrimaryKeySelective(param);
            }
        }
        return flag;
    }

    @Override
    public MerchantInfoVo queryMerchantInfo(MerchantQueryParam queryParam) {
        MerchantInfoVo vo = null;
        MerchantInfo info = new MerchantInfo();
        if (!StringUtils.isEmpty(queryParam.getMerchantGuid())){
            info.setMerchantGuid(queryParam.getMerchantGuid());
        }
        if (!StringUtils.isEmpty(queryParam.getMerchantPhone())){
            info.setMerchantPhone(queryParam.getMerchantPhone());
        }
        if (!StringUtils.isEmpty(queryParam.getWebchartNo())){
            info.setWebchartNo(queryParam.getWebchartNo());
        }
        if (!StringUtils.isEmpty(queryParam.getAlipayNo())){
            info.setAlipayNo(queryParam.getAlipayNo());
        }
        MerchantInfo merchantInfo = iMerchantInfoService.selectOne(info);
        if (merchantInfo != null){
            vo = new MerchantInfoVo();
            BeanUtils.copyProperties(merchantInfo,vo);
            if (merchantInfo.getLastLoginTime() != null){
                vo.setLastLoginTime(DateUtil.formatDate(merchantInfo.getLastLoginTime()));
            }
        }
        return vo;
    }

    @Override
    @Transactional
    public void updateMerchantInfo(MerchantInfoVo merchantInfoVo) {
        iMerchantInfoService.updateMerchantInfo(merchantInfoVo);
    }

    @Override
    public List<MerchantInfoVo> queryMerchantInfos(MerchantQueryParam queryParam) {

        List<Long> dataOrgNos = orgService.queryDataOrgList(queryParam.getUserId());
        Condition condition=new Condition(MerchantInfo.class);
        Example.Criteria criteria=condition.createCriteria();
        criteria.andIn("orgNo",dataOrgNos);
        criteria.andEqualTo("isDel",1);
        List<MerchantInfo> merchantInfos = merchantInfoMapper.selectByCondition(condition);
        List<MerchantInfoVo> merchantInfoVos= Lists.newArrayList();
        if (!CollectionUtils.isEmpty(merchantInfos)){
            for (MerchantInfo merchantInfo : merchantInfos) {
                MerchantInfoVo vo = new MerchantInfoVo();
                BeanUtils.copyProperties(merchantInfo,vo);
                if (merchantInfo.getLastLoginTime() != null){
                    vo.setLastLoginTime(DateUtil.formatDate(merchantInfo.getLastLoginTime()));
                }
                merchantInfoVos.add(vo);
            }
        }
        return merchantInfoVos;
    }

    @Override
    public MerchantInfoVo queryByParams(Integer appType, String id) {
        MerchantInfo merchantInfo;
        if (MerchantConstant.AppType.WECHAT.getType().equals(appType)) {
            MerchantInfo param = new MerchantInfo();
            param.setWebchartNo(id);
            merchantInfo = iMerchantInfoService.selectOne(param);
        } else {
            MerchantInfo param = new MerchantInfo();
            param.setAlipayNo(id);
            merchantInfo = iMerchantInfoService.selectOne(param);
        }

        if (merchantInfo != null) {
            MerchantInfoVo merchantInfoVo = new MerchantInfoVo();
            BeanUtils.copyProperties(merchantInfo,merchantInfoVo);
            return merchantInfoVo;
        }

        return null;
    }
}
