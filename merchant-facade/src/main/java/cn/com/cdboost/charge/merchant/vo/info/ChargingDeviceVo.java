package cn.com.cdboost.charge.merchant.vo.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 设备信息
 */
@Setter
@Getter
@ApiModel(value = "ChargingDeviceVo", description = "设备信息")
public class ChargingDeviceVo implements Serializable{
    /**
     * 项目标识
     */
    @ApiModelProperty(value = "项目标识")
    private String projectGuid;

    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称")
    private String deviceName;

    /**
     * 设备编号
     */
    @ApiModelProperty(value = "设备编号")
    private String deviceNo;
    //设备程序版本
    @ApiModelProperty(value = "设备程序版本")
    private Integer ver;

    /**
     * 0 -离线 1-在线
     */
    @ApiModelProperty(value = "0 -离线 1-在线")
    private Integer online;

    /**
     * 充电桩1号端口状态 0 空闲 1-充电 2-停用  -1故障
     */
    @ApiModelProperty(value = " 充电桩1号端口状态 0 空闲 1-充电 2-停用  -1故障")
    private Integer runState1;

    /**
     * 充电桩2号端口状态 0 空闲 1-充电 2-停用  -1故障
     */
    @ApiModelProperty(value = "充电桩2号端口状态 0 空闲 1-充电 2-停用  -1故障")
    private Integer runState2;

    /**
     * 通信方式
     */
    @ApiModelProperty(value = "通信方式")
    private Integer comMethod;

    /**
     * 通信方式名称
     */
    @ApiModelProperty(value = "通信方式名称")
    private String comMethodName;

    /**
     * 通信编号
     */
    @ApiModelProperty(value = "通信编号")
    private String commNo;

    /**
     * 电流越限阀值
     */
    @ApiModelProperty(value = "电流越限阀值")
    private BigDecimal currentLimit;

    /**
     * 安装地址
     */
    @ApiModelProperty(value = "安装地址")
    private String installAddr;

    /**
     * 安装时间
     */
    @ApiModelProperty(value = "安装时间")
    private String installDate;

    /**
     * 设备描述
     */
    @ApiModelProperty(value = "设备描述")
    private String remark;

    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称")
    private String projectName;

    /**
     * 项目位置
     */
    @ApiModelProperty(value = "项目位置")
    private String projectAddr;

    /**
     * 小区名称
     */
    @ApiModelProperty(value = "小区名称")
    private String communityName;

    /**
     * 物业公司名称
     */
    @ApiModelProperty(value = "物业公司名称")
    private String companyName;

    /**
     * 联系人员
     */
    @ApiModelProperty(value = "联系人员")
    private String contact;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话")
    private String contactTelphone;

    /**
     * 充电桩执行的电价
     */
    @ApiModelProperty(value = "充电桩执行的电价")
    private Float price;

    /**
     * 充电桩唯一标识
     */
    @ApiModelProperty(value = "充电桩唯一标识")
    private String chargingPlieGuid;

    /**
     *总表表号
     */
    @ApiModelProperty(value = "总表表号")
    private String meterNo;

    /**
     *总表地址cno
     */
    @ApiModelProperty(value = "总表地址cno")
    private String meterCno;

    /**
     *变压器号
     */
    @ApiModelProperty(value = "变压器号")
    private String transformerNo;

    /**
     * 端口号
     */
    @ApiModelProperty(value = "端口号")
    private String port;


}