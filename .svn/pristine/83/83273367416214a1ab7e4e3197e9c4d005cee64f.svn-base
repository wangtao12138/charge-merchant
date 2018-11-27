package cn.com.cdboost.charge.merchant.vo.info;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 开电查询方案返回参数
 */
@Setter
@Getter
public class ChargingSchemeDeviceVo extends PaySchemeVo{
    private static final long serialVersionUID = 2501329334347125183L;

    /**
     * 充电桩执行的电价
     */
    private BigDecimal price;

    /**
     * 设备标识
     */
    private String chargingPlieGuid;

    /**
     * 物业标识
     */
    private String propertyGuid;

    /**
     * 设备编号
     */
    private String deviceNo;

    /**
     *通信编号
     */
    private String commNo;

    /**
     *充电桩端口
     */
    private String port;

    /**
     * 0 -离线 1-在线
     */
    private Integer online;

    /**
     * 充电桩状态 0 空闲 1-充电 2-停用  -1故障
     */
    private Integer runState;
}
