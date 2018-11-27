package cn.com.cdboost.charge.merchant.vo.info;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 设备及关联信息返回对象
 */
@Setter
@Getter
public class DeviceRelationVo implements Serializable{
    private static final long serialVersionUID = -7305642974116098180L;
    @ApiModelProperty(value = "商户标识")
    private String merchantGuid;

    @ApiModelProperty(value = "项目标识")
    private String projectGuid;

    @ApiModelProperty(value = "设备标识")
    private String chargingPlieGuid;

    @ApiModelProperty(value = "充电桩名称")
    private String deviceName;

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

    @ApiModelProperty(value = "站点名称")
    private String projectName;

    @ApiModelProperty(value = "联系电话")
    private String contactPhone;
}
