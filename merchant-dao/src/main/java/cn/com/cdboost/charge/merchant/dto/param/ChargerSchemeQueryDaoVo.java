package cn.com.cdboost.charge.merchant.dto.param;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 充电项目方案查询vo
 */
@Getter
@Setter
public class ChargerSchemeQueryDaoVo extends PageQueryVo {

    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 结束时间
     */
    private String endTime;
    private Integer minPower;
    private Integer maxPower;

    /**
     * 项目标识
     */
    private String projectGuid;

    /**
     * 方案标识
     */
    private String schemeGuid;

    /**
     * 营收分析统计类型（1：近一周2：近一月3：近三月）
     */
    private Integer countType;

    private List<Long> orgNoList;
    private Integer nodeType;
    private String nodeId;
    //方案类型
    private Integer schemeType;

}
