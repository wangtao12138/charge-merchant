package cn.com.cdboost.charge.merchant.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "cp_d_device_event")
public class DeviceEvent implements Serializable {
    /**
     * 标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 充电桩唯一标识
     */
    @Column(name = "charging_plie_guid")
    private String chargingPlieGuid;

    /**
     * 电流
     */
    private BigDecimal current;

    /**
     * 电压
     */
    private BigDecimal voltage;

    /**
     * 功率
     */
    private BigDecimal power;

    /**
     * 电量
     */
    @Column(name = "active_total")
    private BigDecimal activeTotal;

    /**
     * 事件代码  1- 电流告警 2-率告警 3-中途更换充电电瓶车 4-设备短路 5-充电结束 0-其他
     */
    @Column(name = "event_code")
    private Integer eventCode;

    /**
     * 事件内容
     */
    @Column(name = "event_content")
    private String eventContent;

    /**
     * 是否提醒客户 0未提醒 1已提醒
     */
    @Column(name = "is_remind")
    private Integer isRemind;

    /**
     * 发生时间
     */
    @Column(name = "event_time")
    private Date eventTime;

    /**
     * 充电记录唯一标识
     */
    @Column(name = "charging_guid")
    private String chargingGuid;

    /**
     * 商户标识
     */
    @Column(name = "merchant_guid")
    private String merchantGuid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getMerchantGuid() {
        return merchantGuid;
    }

    public void setMerchantGuid(String merchantGuid) {
        this.merchantGuid = merchantGuid;
    }

    /**
     * 获取标识id
     *
     * @return id - 标识id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置标识id
     *
     * @param id 标识id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取充电桩唯一标识
     *
     * @return charging_plie_guid - 充电桩唯一标识
     */
    public String getChargingPlieGuid() {
        return chargingPlieGuid;
    }

    /**
     * 设置充电桩唯一标识
     *
     * @param chargingPlieGuid 充电桩唯一标识
     */
    public void setChargingPlieGuid(String chargingPlieGuid) {
        this.chargingPlieGuid = chargingPlieGuid;
    }

    /**
     * 获取电流
     *
     * @return current - 电流
     */
    public BigDecimal getCurrent() {
        return current;
    }

    /**
     * 设置电流
     *
     * @param current 电流
     */
    public void setCurrent(BigDecimal current) {
        this.current = current;
    }

    /**
     * 获取电压
     *
     * @return voltage - 电压
     */
    public BigDecimal getVoltage() {
        return voltage;
    }

    /**
     * 设置电压
     *
     * @param voltage 电压
     */
    public void setVoltage(BigDecimal voltage) {
        this.voltage = voltage;
    }

    /**
     * 获取功率
     *
     * @return power - 功率
     */
    public BigDecimal getPower() {
        return power;
    }

    /**
     * 设置功率
     *
     * @param power 功率
     */
    public void setPower(BigDecimal power) {
        this.power = power;
    }

    /**
     * 获取电量
     *
     * @return active_total - 电量
     */
    public BigDecimal getActiveTotal() {
        return activeTotal;
    }

    /**
     * 设置电量
     *
     * @param activeTotal 电量
     */
    public void setActiveTotal(BigDecimal activeTotal) {
        this.activeTotal = activeTotal;
    }

    /**
     * 获取事件代码  1- 电流告警 2-率告警 3-中途更换充电电瓶车 4-设备短路 5-充电结束 0-其他
     *
     * @return event_code - 事件代码  1- 电流告警 2-率告警 3-中途更换充电电瓶车 4-设备短路 5-充电结束 0-其他
     */
    public Integer getEventCode() {
        return eventCode;
    }

    /**
     * 设置事件代码  1- 电流告警 2-率告警 3-中途更换充电电瓶车 4-设备短路 5-充电结束 0-其他
     *
     * @param eventCode 事件代码  1- 电流告警 2-率告警 3-中途更换充电电瓶车 4-设备短路 5-充电结束 0-其他
     */
    public void setEventCode(Integer eventCode) {
        this.eventCode = eventCode;
    }

    /**
     * 获取事件内容
     *
     * @return event_content - 事件内容
     */
    public String getEventContent() {
        return eventContent;
    }

    /**
     * 设置事件内容
     *
     * @param eventContent 事件内容
     */
    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    /**
     * 获取是否提醒客户 0未提醒 1已提醒
     *
     * @return is_remind - 是否提醒客户 0未提醒 1已提醒
     */
    public Integer getIsRemind() {
        return isRemind;
    }

    /**
     * 设置是否提醒客户 0未提醒 1已提醒
     *
     * @param isRemind 是否提醒客户 0未提醒 1已提醒
     */
    public void setIsRemind(Integer isRemind) {
        this.isRemind = isRemind;
    }

    /**
     * 获取发生时间
     *
     * @return event_time - 发生时间
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * 设置发生时间
     *
     * @param eventTime 发生时间
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * 获取充电记录唯一标识
     *
     * @return charging_guid - 充电记录唯一标识
     */
    public String getChargingGuid() {
        return chargingGuid;
    }

    /**
     * 设置充电记录唯一标识
     *
     * @param chargingGuid 充电记录唯一标识
     */
    public void setChargingGuid(String chargingGuid) {
        this.chargingGuid = chargingGuid;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}