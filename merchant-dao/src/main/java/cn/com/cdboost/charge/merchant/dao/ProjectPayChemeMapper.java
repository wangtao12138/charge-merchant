package cn.com.cdboost.charge.merchant.dao;

import cn.com.cdboost.charge.merchant.common.CommonMapper;
import cn.com.cdboost.charge.merchant.model.ProjectPayCheme;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProjectPayChemeMapper extends CommonMapper<ProjectPayCheme> {
    //批量修改方案状态
    void batchUpdate(List<ProjectPayCheme> list);
}