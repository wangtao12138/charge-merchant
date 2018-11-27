package cn.com.cdboost.charge.merchant.dubbo;

import cn.com.cdboost.charge.base.exception.BusinessException;
import cn.com.cdboost.charge.base.vo.PageData;
import cn.com.cdboost.charge.merchant.vo.dto.ProjectInfoDto;
import cn.com.cdboost.charge.merchant.vo.info.ChargerSchemeQueryVo;
import cn.com.cdboost.charge.merchant.vo.info.ProjectListInfo;
import cn.com.cdboost.charge.merchant.vo.info.ProjectVo;
import cn.com.cdboost.charge.merchant.vo.param.ProjectQueryParam;

import java.util.List;
import java.util.Set;

/**
 * 站点接口
 */
public interface ProjectService {

    /**
     * 查询站点列表
     * @param queryVo
     * @return
     */
    PageData<ProjectListInfo> queryProjectByPropertyGuid(ProjectQueryParam queryVo);

    /**
     * 新增站点
     * @param queryVo
     */
    void addProject(ProjectVo queryVo) throws BusinessException;

    /**
     * 修改站点
     * @param queryVo
     */
    void updateProject(ProjectVo queryVo) throws BusinessException;

    /**
     * 删除站点
     * @param projectGuids
     */
    void deleteProjectByProjectGuids(List<String> projectGuids);

    /**
     * 查询站点详情
     * @param projectGuid
     * @return
     */
    ProjectVo queryProjectDetail(String projectGuid);

    /**
     * 分页查询站点基础信息列表
     * @param queryVo
     * @return
     */
    PageData<ProjectVo> queryProjects(ProjectQueryParam queryVo);

    List<ProjectVo> queryAllProject(Integer userId);

    /**
     * 通过组织批量查询站点
     * @param orgNoList
     * @return
     */
    List<ProjectVo> batchQueryProject(List<Long> orgNoList,String projectName);

    public List<ProjectInfoDto> queryProjectTreeByName(Set<Long> dataOrgNos, String projectName);

    PageData queryList(ChargerSchemeQueryVo queryVo, Integer userId);
}
