package cn.com.cdboost.charge.merchant.vo.info;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class DeviceDetailVo implements Serializable{
    private static final long serialVersionUID = -3022833411830279771L;
    @ApiModelProperty(value = "设备标识")
    private String chargingPlieGuid;

    @ApiModelProperty(value = "设备编号")
    private String deviceNo;

    @ApiModelProperty(value = "通信编号")
    private String commNo;

    @ApiModelProperty(value = "充电桩端口（0-9、a-f 一共16个端口号）")
    private String port;

    @ApiModelProperty(value = "0 -离线 1-在线")
    private Integer online;

    @ApiModelProperty(value = "充电桩状态 0 空闲 1-充电 2-停用  -1故障")
    private Integer runState;

    @ApiModelProperty(value = "安装地址")
    private String installAddr;

    @ApiModelProperty(value = "安装时间")
    private String installDate;

    @ApiModelProperty(value = "已充时长（分钟）")
    private Integer useTime;

    @ApiModelProperty(value = "消耗电量（度）")
    private BigDecimal usePower;

    @ApiModelProperty(value = "实际计费（元）")
    private BigDecimal consumptionMoney;
}
