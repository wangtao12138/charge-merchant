package cn.com.cdboost.charge.merchant.vo.info;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class ChargingSchemeVo implements Serializable{
    private static final long serialVersionUID = -28884037492602194L;
    private String schemeGuid;
    private String merchantGuid;
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
    private Integer powerCategory;
    private Integer isEnable;
    //方案类型
    private Integer schemeType;
}
