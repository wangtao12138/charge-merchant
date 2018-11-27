package cn.com.cdboost.charge.merchant.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 充电项目列表返回对象
 */
@Getter
@Setter
public class ChargingProjectDaoDto {
    private String projectGuid;
    private String merchantGuid;
    private String projectName;
    private String projectAddr;
    private Integer deviceNum;
    private String communityName;
    private String companyName;
    private String createTime;
    private BigDecimal basePrice;
    private BigDecimal upPrice;
    private String contact;
    private String contactPhone;
    private String remark;
    private Long orgNo;
    private String orgName;
    //方案类型
    private Integer schemeType;
    /**
     *总表表号
     */
    private String meterNo;


}
