package cn.com.cdboost.charge.merchant.service;

import cn.com.cdboost.charge.base.vo.PageData;
import cn.com.cdboost.charge.merchant.common.BaseService;
import cn.com.cdboost.charge.merchant.model.Project;
import cn.com.cdboost.charge.merchant.vo.param.ProjectQueryParam;

import java.util.List;

/**
 * 站点接口
 */
public interface IProjectService extends BaseService<Project>{
    /**
     * 条件查询
     * @param projectGuid
     * @param projectName
     * @return
     */
    List<Project> queryProjectsByCondition(String projectGuid,String projectName);

    /**
     * p批量条件查询
     * @param projectGuids
     * @return
     */
    List<Project> queryProjects(List<String> projectGuids);

    /**
     * 通过guid修改站点
     * @param project
     */
    void updateByProjectGuid(Project project);

    /**
     * 批量删除站点
     * @param projectGuids
     */
    void batchDelete(List<String> projectGuids);

    /**
     * 分页查询站点基础信息列表
     * @param queryVo
     * @return
     */
    PageData<Project> queryProjectsPage(ProjectQueryParam queryVo);
}
