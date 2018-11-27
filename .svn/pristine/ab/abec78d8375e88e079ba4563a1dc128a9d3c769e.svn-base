package cn.com.cdboost.charge.merchant.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "cp_d_device")
public class Device implements Serializable {
    /**
     * 标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商户标识
     */
    @Column(name = "merchant_guid")
    private String merchantGuid;

    /**
     * 项目标识
     */
    @Column(name = "project_guid")
    private String projectGuid;

    @Column(name = "charging_plie_guid")
    private String chargingPlieGuid;

    /**
     * 充电桩名称
     */
    @Column(name = "device_name")
    private String deviceName;

    /**
     * 设备编号
     */
    @Column(name = "device_no")
    private String deviceNo;

    /**
     * 充电桩设备型号
     */
    @Column(name = "device_mode")
    private String deviceMode;

    /**
     * 通信编号
     */
    @Column(name = "comm_no")
    private String commNo;

    /**
     * 充电桩端口（0-9、a-f 一共16个端口号）
     */
    private String port;

    /**
     * 0 -离线 1-在线
     */
    private Integer online;

    /**
     * 通信方式 32-loraWAN 
     */
    @Column(name = "com_method")
    private Integer comMethod;

    /**
     * 充电桩状态 0 空闲 1-充电 2-停用  -1故障 
     */
    @Column(name = "run_state")
    private Integer runState;

    /**
     * 电流越限阀值
     */
    @Column(name = "current_limit")
    private BigDecimal currentLimit;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 经度坐标
     */
    private BigDecimal lng;

    /**
     * 纬度坐标
     */
    private BigDecimal lat;

    /**
     * 1 GPS 2百度坐标
     */
    @Column(name = "location_type")
    private Integer locationType;

    /**
     * 安装地址
     */
    @Column(name = "install_addr")
    private String installAddr;

    /**
     * 安装时间
     */
    @Column(name = "install_date")
    private Date installDate;

    /**
     * 设备描述
     */
    private String remark;

    /**
     * 总表表号
     */
    @Column(name = "meter_no")
    private String meterNo;

    /**
     * 总表地址cno
     */
    @Column(name = "meter_cno")
    private String meterCno;

    /**
     * 变压器号
     */
    @Column(name = "transformer_no")
    private String transformerNo;

    /**
     * 设备状态下发标识 0-未下发 1-已下发
     */
    @Column(name = "send_flag")
    private Integer sendFlag;

    /**
     * 创建人员ID
     */
    @Column(name = "create_user_id")
    private Long createUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人员ID
     */
    @Column(name = "update_user_id")
    private Long updateUserId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除 0 正常 1删除
     */
    @Column(name = "is_del")
    private Integer isDel;

    private static final long serialVersionUID = 1L;

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
     * 获取商户标识
     *
     * @return merchant_guid - 商户标识
     */
    public String getMerchantGuid() {
        return merchantGuid;
    }

    /**
     * 设置商户标识
     *
     * @param merchantGuid 商户标识
     */
    public void setMerchantGuid(String merchantGuid) {
        this.merchantGuid = merchantGuid;
    }

    /**
     * 获取项目标识
     *
     * @return project_guid - 项目标识
     */
    public String getProjectGuid() {
        return projectGuid;
    }

    /**
     * 设置项目标识
     *
     * @param projectGuid 项目标识
     */
    public void setProjectGuid(String projectGuid) {
        this.projectGuid = projectGuid;
    }

    /**
     * @return charging_plie_guid
     */
    public String getChargingPlieGuid() {
        return chargingPlieGuid;
    }

    /**
     * @param chargingPlieGuid
     */
    public void setChargingPlieGuid(String chargingPlieGuid) {
        this.chargingPlieGuid = chargingPlieGuid;
    }

    /**
     * 获取充电桩名称
     *
     * @return device_name - 充电桩名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设置充电桩名称
     *
     * @param deviceName 充电桩名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * 获取设备编号
     *
     * @return device_no - 设备编号
     */
    public String getDeviceNo() {
        return deviceNo;
    }

    /**
     * 设置设备编号
     *
     * @param deviceNo 设备编号
     */
    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    /**
     * 获取充电桩设备型号
     *
     * @return device_mode - 充电桩设备型号
     */
    public String getDeviceMode() {
        return deviceMode;
    }

    /**
     * 设置充电桩设备型号
     *
     * @param deviceMode 充电桩设备型号
     */
    public void setDeviceMode(String deviceMode) {
        this.deviceMode = deviceMode;
    }

    /**
     * 获取通信编号
     *
     * @return comm_no - 通信编号
     */
    public String getCommNo() {
        return commNo;
    }

    /**
     * 设置通信编号
     *
     * @param commNo 通信编号
     */
    public void setCommNo(String commNo) {
        this.commNo = commNo;
    }

    /**
     * 获取充电桩端口（0-9、a-f 一共16个端口号）
     *
     * @return port - 充电桩端口（0-9、a-f 一共16个端口号）
     */
    public String getPort() {
        return port;
    }

    /**
     * 设置充电桩端口（0-9、a-f 一共16个端口号）
     *
     * @param port 充电桩端口（0-9、a-f 一共16个端口号）
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * 获取0 -离线 1-在线
     *
     * @return online - 0 -离线 1-在线
     */
    public Integer getOnline() {
        return online;
    }

    /**
     * 设置0 -离线 1-在线
     *
     * @param online 0 -离线 1-在线
     */
    public void setOnline(Integer online) {
        this.online = online;
    }

    /**
     * 获取通信方式 32-loraWAN 
     *
     * @return com_method - 通信方式 32-loraWAN 
     */
    public Integer getComMethod() {
        return comMethod;
    }

    /**
     * 设置通信方式 32-loraWAN 
     *
     * @param comMethod 通信方式 32-loraWAN 
     */
    public void setComMethod(Integer comMethod) {
        this.comMethod = comMethod;
    }

    /**
     * 获取充电桩状态 0 空闲 1-充电 2-停用  -1故障 
     *
     * @return run_state - 充电桩状态 0 空闲 1-充电 2-停用  -1故障 
     */
    public Integer getRunState() {
        return runState;
    }

    /**
     * 设置充电桩状态 0 空闲 1-充电 2-停用  -1故障 
     *
     * @param runState 充电桩状态 0 空闲 1-充电 2-停用  -1故障 
     */
    public void setRunState(Integer runState) {
        this.runState = runState;
    }

    /**
     * 获取电流越限阀值
     *
     * @return current_limit - 电流越限阀值
     */
    public BigDecimal getCurrentLimit() {
        return currentLimit;
    }

    /**
     * 设置电流越限阀值
     *
     * @param currentLimit 电流越限阀值
     */
    public void setCurrentLimit(BigDecimal currentLimit) {
        this.currentLimit = currentLimit;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return district - 区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区
     *
     * @param district 区
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获取经度坐标
     *
     * @return lng - 经度坐标
     */
    public BigDecimal getLng() {
        return lng;
    }

    /**
     * 设置经度坐标
     *
     * @param lng 经度坐标
     */
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    /**
     * 获取纬度坐标
     *
     * @return lat - 纬度坐标
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * 设置纬度坐标
     *
     * @param lat 纬度坐标
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    /**
     * 获取1 GPS 2百度坐标
     *
     * @return location_type - 1 GPS 2百度坐标
     */
    public Integer getLocationType() {
        return locationType;
    }

    /**
     * 设置1 GPS 2百度坐标
     *
     * @param locationType 1 GPS 2百度坐标
     */
    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    /**
     * 获取安装地址
     *
     * @return install_addr - 安装地址
     */
    public String getInstallAddr() {
        return installAddr;
    }

    /**
     * 设置安装地址
     *
     * @param installAddr 安装地址
     */
    public void setInstallAddr(String installAddr) {
        this.installAddr = installAddr;
    }

    /**
     * 获取安装时间
     *
     * @return install_date - 安装时间
     */
    public Date getInstallDate() {
        return installDate;
    }

    /**
     * 设置安装时间
     *
     * @param installDate 安装时间
     */
    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    /**
     * 获取设备描述
     *
     * @return remark - 设备描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置设备描述
     *
     * @param remark 设备描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取总表表号
     *
     * @return meter_no - 总表表号
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置总表表号
     *
     * @param meterNo 总表表号
     */
    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    /**
     * 获取总表地址cno
     *
     * @return meter_cno - 总表地址cno
     */
    public String getMeterCno() {
        return meterCno;
    }

    /**
     * 设置总表地址cno
     *
     * @param meterCno 总表地址cno
     */
    public void setMeterCno(String meterCno) {
        this.meterCno = meterCno;
    }

    /**
     * 获取变压器号
     *
     * @return transformer_no - 变压器号
     */
    public String getTransformerNo() {
        return transformerNo;
    }

    /**
     * 设置变压器号
     *
     * @param transformerNo 变压器号
     */
    public void setTransformerNo(String transformerNo) {
        this.transformerNo = transformerNo;
    }

    /**
     * 获取设备状态下发标识 0-未下发 1-已下发
     *
     * @return send_flag - 设备状态下发标识 0-未下发 1-已下发
     */
    public Integer getSendFlag() {
        return sendFlag;
    }

    /**
     * 设置设备状态下发标识 0-未下发 1-已下发
     *
     * @param sendFlag 设备状态下发标识 0-未下发 1-已下发
     */
    public void setSendFlag(Integer sendFlag) {
        this.sendFlag = sendFlag;
    }

    /**
     * 获取创建人员ID
     *
     * @return create_user_id - 创建人员ID
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人员ID
     *
     * @param createUserId 创建人员ID
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
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

    /**
     * 获取更新人员ID
     *
     * @return update_user_id - 更新人员ID
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置更新人员ID
     *
     * @param updateUserId 更新人员ID
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除 0 正常 1删除
     *
     * @return is_del - 是否删除 0 正常 1删除
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除 0 正常 1删除
     *
     * @param isDel 是否删除 0 正常 1删除
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}