package cn.com.cdboost.charge.merchant.dubbo.impl;

import cn.com.cdboost.charge.base.util.UuidUtil;
import cn.com.cdboost.charge.merchant.constant.SchemeConstant;
import cn.com.cdboost.charge.merchant.dao.ProjectPayChemeMapper;
import cn.com.cdboost.charge.merchant.dubbo.PaySchemeService;
import cn.com.cdboost.charge.merchant.model.ComPayCheme;
import cn.com.cdboost.charge.merchant.model.MerchantInfo;
import cn.com.cdboost.charge.merchant.model.ProjectPayCheme;
import cn.com.cdboost.charge.merchant.service.IComPaySchemeService;
import cn.com.cdboost.charge.merchant.service.IMerchantInfoService;
import cn.com.cdboost.charge.merchant.service.IPaySchemeService;
import cn.com.cdboost.charge.merchant.vo.info.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.base.Function;
import com.google.common.collect.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Nullable;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Slf4j
@Service(version = "1.0",retries = -1,timeout = 5000)
public class PaySchemeServiceImpl implements PaySchemeService {
    @Resource
    private IPaySchemeService iPaySchemeService;
    @Resource
    private IComPaySchemeService iComPaySchemeService;
    @Resource
    private IMerchantInfoService iMerchantInfoService;
    @Autowired
    private ProjectPayChemeMapper projectPayChemeMapper;

    @Override
    public PaySchemeVo queryPaySchemeBySchemeGuid(String schemeGuid) {
        PaySchemeVo paySchemeVo = new PaySchemeVo();
        ProjectPayCheme param = new ProjectPayCheme();
        param.setSchemeGuid(schemeGuid);
        //查询项目方案信息表
        ProjectPayCheme projectPayCheme = iPaySchemeService.selectOne(param);
        if (projectPayCheme != null){//判断项目方案表是否存在此方案
            MerchantInfo merchantInfo = new MerchantInfo();
            merchantInfo.setMerchantGuid(projectPayCheme.getMerchantGuid());
            MerchantInfo merchantInfo1 = iMerchantInfoService.selectOne(merchantInfo);
            BeanUtils.copyProperties(projectPayCheme,paySchemeVo);
            paySchemeVo.setServiceMode(merchantInfo1.getServiceMode());
            return paySchemeVo;
        }
        ComPayCheme comPayCheme = new ComPayCheme();
        comPayCheme.setSchemeGuid(schemeGuid);
        //查询公共方案信息表
        ComPayCheme comPayChemeSelect = iComPaySchemeService.selectOne(comPayCheme);
        BeanUtils.copyProperties(comPayChemeSelect,paySchemeVo);
        return paySchemeVo;
    }

    @Override
    public List<PaySchemeVo> querySchemeList4ChargePage(String projectGuid) {
        List<PaySchemeVo> paySchemeVos = Lists.newArrayList();
        Condition condition = new Condition(ProjectPayCheme.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("projectGuid", projectGuid);
        criteria.andEqualTo("isEnable",1);
        criteria.andEqualTo("schemeType",0);
        Set<Integer> set = Sets.newHashSet();
        set.add(SchemeConstant.SchemePayCategory.BALANCE_RECHARGE.getType());
        set.add(SchemeConstant.SchemePayCategory.IC_RECHARGE.getType());
        criteria.andNotIn("payCategory", set);
        condition.setOrderByClause("power_category,sort_no,real_money ASC");
        List<ProjectPayCheme> projectPayChemes = projectPayChemeMapper.selectByCondition(condition);
        for (ProjectPayCheme projectPayCheme : projectPayChemes) {
            PaySchemeVo vo = new PaySchemeVo();
            BeanUtils.copyProperties(projectPayCheme,vo);
            paySchemeVos.add(vo);
        }
        return paySchemeVos;
    }
    @Override
    public List<PaySchemeVo> querySchemeTwoList(String projectGuid) {
        List<PaySchemeVo> list = Lists.newArrayList();
        Condition condition = new Condition(ProjectPayCheme.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("projectGuid", projectGuid);
        criteria.andEqualTo("isEnable",1);
        criteria.andEqualTo("schemeType",1);
        criteria.andEqualTo("payCategory",SchemeConstant.SchemePayCategory.TEMPORARY_RECHARGE.getType());
        condition.setOrderByClause("power_category,real_money ASC");
        List<ProjectPayCheme> projectPayChemes = projectPayChemeMapper.selectByCondition(condition);
        for (ProjectPayCheme projectPayCheme : projectPayChemes) {
            PaySchemeVo vo = new PaySchemeVo();
            BeanUtils.copyProperties(projectPayCheme,vo);
            list.add(vo);
        }
        return list;
    }

    @Override
    public List<PaySchemeVo> querySchemeList4ActivityPage() {
        Condition condition = new Condition(ProjectPayCheme.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("payCategory",SchemeConstant.SchemePayCategory.BALANCE_RECHARGE.getType());
        criteria.andEqualTo("isEnable",1);
        criteria.andEqualTo("schemeType",0);
        condition.setOrderByClause("real_money ASC");

        List<ProjectPayCheme> projectPayChemes = projectPayChemeMapper.selectByCondition(condition);
        List<PaySchemeVo> list = Lists.newArrayList();
        for (ProjectPayCheme projectPayCheme : projectPayChemes) {
            PaySchemeVo vo = new PaySchemeVo();
            BeanUtils.copyProperties(projectPayCheme,vo);
            list.add(vo);
        }
        return list;
    }

    @Override
    @Transactional
    public void editScheme(SchemeEditVo param) {
        List<ChargingSchemeVo> chargingSchemeDtos = param.getSchemeList();
        if (!CollectionUtils.isEmpty(chargingSchemeDtos)){
            //新增的方案
            List<ProjectPayCheme> addScheme = Lists.newArrayList();
            //删除的方案
            List<String> deleteScheme = Lists.newArrayList();
            //停用或启用的方案
            List<ProjectPayCheme> offOnScheme = Lists.newArrayList();
            for (ChargingSchemeVo chargingSchemeDto : chargingSchemeDtos) {
                ProjectPayCheme chargingPayCheme = new ProjectPayCheme();
                if (chargingSchemeDto.getFlag() != null) {
                    BeanUtils.copyProperties(chargingSchemeDto, chargingPayCheme);
                    chargingPayCheme.setCreateTime(new Date());
                    chargingPayCheme.setUpdateTime(new Date());
                    if (chargingSchemeDto.getFlag() == 0) {//判断该方案是新增还是删除 0-新增 1-删除 2-修改 3-启用或停用
                        //暂时写死月卡为1个月
                        if (chargingSchemeDto.getPayCategory() == SchemeConstant.SchemePayCategory.MONTH_RECHARGE.getType()){
                            chargingPayCheme.setNumMonths(1);
                        }else {
                            chargingPayCheme.setNumMonths(0);
                        }
                        chargingPayCheme.setSchemeGuid(UuidUtil.getUuid());
                        //chargingPayCheme.setIsEnable(ChargeConstant.SchemeIsEnable.ABLE.getType());
                        //后端写死排序，月卡排前面
                        if (chargingSchemeDto.getPayCategory() == SchemeConstant.SchemePayCategory.MONTH_RECHARGE.getType()) {
                            chargingPayCheme.setSortNo(1);
                        } else if (chargingSchemeDto.getPayCategory() == SchemeConstant.SchemePayCategory.RECHARGE_FULL.getType()) {
                            chargingPayCheme.setSortNo(2);
                        } else if (chargingSchemeDto.getPayCategory() == SchemeConstant.SchemePayCategory.TEMPORARY_RECHARGE.getType()) {
                            chargingPayCheme.setSortNo(3);
                        } else {
                            chargingPayCheme.setSortNo(4);
                        }
                        addScheme.add(chargingPayCheme);
                    } else if (chargingSchemeDto.getFlag() == 1) {
                        deleteScheme.add(chargingSchemeDto.getSchemeGuid());
                    } else if (chargingSchemeDto.getFlag() == 2) {
                        //删除编辑前的方案
                        deleteScheme.add(chargingSchemeDto.getSchemeGuid());
                        //新增编辑后的方案
                        BeanUtils.copyProperties(chargingSchemeDto, chargingPayCheme);
                        chargingPayCheme.setSchemeGuid(UuidUtil.getUuid());
                        //chargingPayCheme.setIsEnable(ChargeConstant.SchemeIsEnable.ABLE.getType());
                        //后端写死排序，月卡排前面
                        if (chargingSchemeDto.getPayCategory() == SchemeConstant.SchemePayCategory.MONTH_RECHARGE.getType()) {
                            chargingPayCheme.setSortNo(1);
                        } else if (chargingSchemeDto.getPayCategory() == SchemeConstant.SchemePayCategory.RECHARGE_FULL.getType()) {
                            chargingPayCheme.setSortNo(2);
                        } else if (chargingSchemeDto.getPayCategory() == SchemeConstant.SchemePayCategory.TEMPORARY_RECHARGE.getType()) {
                            chargingPayCheme.setSortNo(3);
                        } else {
                            chargingPayCheme.setSortNo(4);
                        }
                        addScheme.add(chargingPayCheme);
                    } else if (chargingSchemeDto.getFlag() == 3) {
                        BeanUtils.copyProperties(chargingSchemeDto,chargingPayCheme);
                        offOnScheme.add(chargingPayCheme);
                    }
                }
            }
            if (!CollectionUtils.isEmpty(deleteScheme)){
                iPaySchemeService.updateSchemeIsEnable(deleteScheme,SchemeConstant.SchemeIsDel.UNABLE.getType());
            }
            if (!CollectionUtils.isEmpty(addScheme)) {
                //插入新方案
                projectPayChemeMapper.insertList(addScheme);

                /*//插入相同的ic卡充电方案
                List<ChargingPayCheme> addIcScheme = Lists.newArrayList();
                for (ChargingPayCheme chargingPayCheme : addScheme) {
                    if (chargingPayCheme.getSchemeType()==1){
                        chargingPayCheme.setPayCategory(5);
                        addIcScheme.add(chargingPayCheme);
                    }
                }
                if (!CollectionUtils.isEmpty(addIcScheme)){
                    chargingPayChemeMapper.insertList(addIcScheme);
                }*/
            }
            if (!CollectionUtils.isEmpty(offOnScheme)) {
                //修改方案状态
                projectPayChemeMapper.batchUpdate(offOnScheme);
            }
        }
    }

    @Override
    @Transactional
    public void offOnScheme(String schemeGuid, Integer onOrOff) {
        Condition condition = new Condition(ProjectPayCheme.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("schemeGuid",schemeGuid);
        ProjectPayCheme projectPayCheme = new ProjectPayCheme();
        projectPayCheme.setIsEnable(onOrOff);
        projectPayChemeMapper.updateByConditionSelective(projectPayCheme,condition);
    }

    @Override
    public List<ChargerSchemeVo> querySchemeList(String projectGuid, Integer schemeType) {
        Condition condition = new Condition(ProjectPayCheme.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("isEnable",SchemeConstant.SchemeIsDel.ABLE.getType());
        criteria.andEqualTo("projectGuid",projectGuid);
        criteria.andEqualTo("schemeType",schemeType);
        criteria.andNotEqualTo("payCategory",SchemeConstant.SchemePayCategory.BALANCE_RECHARGE.getType());
        //按项目查询所有可用的，非活动的方案
        List<ProjectPayCheme> chargingPayChemes = projectPayChemeMapper.selectByCondition(condition);
        //返回对象集合
        List<ChargerSchemeVo> chargerSchemeVos = Lists.newArrayList();

        //按功率分组
        ImmutableListMultimap<Integer, ProjectPayCheme> mulPayCheme = Multimaps.index(chargingPayChemes, new Function<ProjectPayCheme, Integer>() {
            @Nullable
            @Override
            public Integer apply(@Nullable ProjectPayCheme chargingPayCheme) {
                return chargingPayCheme.getMaxPower() + chargingPayCheme.getMinPower();
            }
        });
        //遍历分组后的集合，组装返回对象
        ImmutableSet<Integer> keys = mulPayCheme.keySet();
        for (Integer key : keys) {
            //对应功率下的方案
            ImmutableList<ProjectPayCheme> chargingPayChemes1 = mulPayCheme.get(key);
            List<ChargingSchemeDto> chargingSchemeDtos = Lists.newArrayList();
            ChargerSchemeVo chargerSchemeVo = new ChargerSchemeVo();
            for (ProjectPayCheme chargingPayCheme : chargingPayChemes1) {
                ChargingSchemeDto dto = new ChargingSchemeDto();
                BeanUtils.copyProperties(chargingPayCheme, dto);
                chargingSchemeDtos.add(dto);
                BeanUtils.copyProperties(chargingPayCheme, chargerSchemeVo);
                chargerSchemeVo.setSchemeList(chargingSchemeDtos);
            }
            chargerSchemeVos.add(chargerSchemeVo);
        }
        return chargerSchemeVos;
    }
}
