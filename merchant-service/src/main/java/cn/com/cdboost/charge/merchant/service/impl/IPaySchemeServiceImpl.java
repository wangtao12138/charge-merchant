package cn.com.cdboost.charge.merchant.service.impl;

import cn.com.cdboost.charge.merchant.common.BaseServiceImpl;
import cn.com.cdboost.charge.merchant.dao.ProjectPayChemeMapper;
import cn.com.cdboost.charge.merchant.model.ProjectPayCheme;
import cn.com.cdboost.charge.merchant.service.IPaySchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

@Service
public class IPaySchemeServiceImpl extends BaseServiceImpl<ProjectPayCheme> implements IPaySchemeService {
    @Autowired
    private ProjectPayChemeMapper projectPayChemeMapper;
    /**
     * 修改数据库方案状态
     * @param schemeGuids 方案唯一标识
     * @param isEnable
     */
    @Override
    public void updateSchemeIsEnable(List<String> schemeGuids, Integer isEnable){
        ProjectPayCheme chargingPayCheme = new ProjectPayCheme();
        chargingPayCheme.setIsEnable(isEnable);
        Condition condition = new Condition(ProjectPayCheme.class);
        Condition.Criteria criteria = condition.createCriteria();
        criteria.andIn("schemeGuid",schemeGuids);
        projectPayChemeMapper.updateByConditionSelective(chargingPayCheme, condition);
    }
}
