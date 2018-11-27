package cn.com.cdboost.charge.merchant.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2018/5/16 0016.
 */
@Getter
@Setter
public class ProjectInfoDaoDto {
    /**
     * 组织编号
     */
    private Long orgNo;

    /**
     * 项目编号
     */
    private String projectGuid;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 该组织拥有的项目数
     */
    private Long projectHolds;


}
