package cn.com.cdboost.charge.merchant.vo.info;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ChargingSchemeDto implements Serializable{
    private static final long serialVersionUID = -4992689405914090846L;
    private String schemeGuid;
    private Integer chargingCnt;
    private BigDecimal realMoney;
    private Integer chargingTime;
    //0添加，1删除
    private Integer flag;

    //方案类别
    private Integer payCategory;

    private String projectGuid;
    private Integer minPower;
    private Integer maxPower;
    private Integer power;
    private Integer isEnable;
    //方案类型
    private Integer schemeType;
}
