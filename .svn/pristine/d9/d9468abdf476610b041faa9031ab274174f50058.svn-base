package cn.com.cdboost.charge.merchant.vo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@ApiModel(value = "TodayDataResp",description = "商户一天数据")
public class TodayMerchantInfo {
    @ApiModelProperty(value = "总收入")
    private BigDecimal income;

    @ApiModelProperty(value = "总支出")
    private BigDecimal cost;

    @ApiModelProperty(value = "总电量")
    private BigDecimal usePower;

    @ApiModelProperty(value = "总充电次数")
    private Integer chargingTimes;

    @ApiModelProperty(value = "代理商（物业）数量")
    private Integer merchantPropertyNum;

    @ApiModelProperty(value = "站点数量")
    private Integer projectNum;

    @ApiModelProperty(value = "告警数")
    private Integer alarmNum;
}
