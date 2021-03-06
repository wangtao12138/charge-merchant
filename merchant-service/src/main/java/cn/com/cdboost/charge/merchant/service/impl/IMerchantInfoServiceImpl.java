package cn.com.cdboost.charge.merchant.service.impl;

import cn.com.cdboost.charge.base.util.DateUtil;
import cn.com.cdboost.charge.merchant.common.BaseServiceImpl;
import cn.com.cdboost.charge.merchant.dao.MerchantInfoMapper;
import cn.com.cdboost.charge.merchant.model.MerchantInfo;
import cn.com.cdboost.charge.merchant.service.IMerchantInfoService;
import cn.com.cdboost.charge.merchant.vo.info.MerchantInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;


@Service
public class IMerchantInfoServiceImpl extends BaseServiceImpl<MerchantInfo> implements IMerchantInfoService {
    @Autowired
    private MerchantInfoMapper merchantInfoMapper;
    @Override
    public void updateMerchantInfo(MerchantInfoVo merchantInfoVo) {
        Condition condition = new Condition(MerchantInfo.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("merchantGuid",merchantInfoVo.getMerchantGuid());
        MerchantInfo info = new MerchantInfo();
        BeanUtils.copyProperties(merchantInfoVo,info);
        if (!StringUtils.isEmpty(merchantInfoVo.getLastLoginTime())){
            info.setLastLoginTime(DateUtil.parseDateTime(merchantInfoVo.getLastLoginTime()));
        }
        info.setUpdateTime(new Date());
        merchantInfoMapper.updateByConditionSelective(info,condition);
    }
}
