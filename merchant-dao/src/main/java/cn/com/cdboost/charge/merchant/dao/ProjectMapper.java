package cn.com.cdboost.charge.merchant.dao;

import cn.com.cdboost.charge.merchant.common.CommonMapper;
import cn.com.cdboost.charge.merchant.dto.ChargingProjectDaoDto;
import cn.com.cdboost.charge.merchant.dto.ProjectInfoDaoDto;
import cn.com.cdboost.charge.merchant.dto.ProjectListDto;
import cn.com.cdboost.charge.merchant.dto.param.ChargerSchemeQueryDaoVo;
import cn.com.cdboost.charge.merchant.dto.param.ProjectQueryParamDao;
import cn.com.cdboost.charge.merchant.model.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper extends CommonMapper<Project> {
    //查询设备列表
    List<ProjectListDto> queryProjectDeviceCount(ProjectQueryParamDao queryVo);

    List<ProjectInfoDaoDto> queryProjectTreeByName(@Param("list") List<Long> orgNo, @Param("projectName") String projectName);

    List<ChargingProjectDaoDto> queryList(ChargerSchemeQueryDaoVo queryVo);

    Long queryListTotal(ChargerSchemeQueryDaoVo queryVo);

    Integer queryTotal(ProjectQueryParamDao projectQueryParamDao);
}