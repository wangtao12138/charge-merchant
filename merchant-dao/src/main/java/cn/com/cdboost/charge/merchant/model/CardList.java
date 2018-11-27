package cn.com.cdboost.charge.merchant.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "cp_d_card_list")
public class CardList implements Serializable {
    /**
     * 标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * IC在项目中的唯一标识
     */
    @Column(name = "point_code")
    private Integer pointCode;

    /**
     * 设备编号
     */
    @Column(name = "device_no")
    private String deviceNo;

    /**
     * 设备deveui
     */
    @Column(name = "comm_no")
    private String commNo;

    /**
     * IC卡编号
     */
    @Column(name = "card_id")
    private String cardId;

    /**
     * IC卡状态 -1移除  0-欠费  1-正常
     */
    private Integer state;

    /**
     * 下发状态 0-未下发 1-已下发
     */
    @Column(name = "send_flag")
    private Integer sendFlag;

    /**
     * 写入时间
     */
    @Column(name = "write_time")
    private Date writeTime;

    /**
     * 下发时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 项目标识
     */
    @Column(name = "project_guid")
    private String projectGuid;

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
     * 获取IC在项目中的唯一标识
     *
     * @return point_code - IC在项目中的唯一标识
     */
    public Integer getPointCode() {
        return pointCode;
    }

    /**
     * 设置IC在项目中的唯一标识
     *
     * @param pointCode IC在项目中的唯一标识
     */
    public void setPointCode(Integer pointCode) {
        this.pointCode = pointCode;
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
     * 获取设备deveui
     *
     * @return comm_no - 设备deveui
     */
    public String getCommNo() {
        return commNo;
    }

    /**
     * 设置设备deveui
     *
     * @param commNo 设备deveui
     */
    public void setCommNo(String commNo) {
        this.commNo = commNo;
    }

    /**
     * 获取IC卡编号
     *
     * @return card_id - IC卡编号
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置IC卡编号
     *
     * @param cardId IC卡编号
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取IC卡状态 -1移除  0-欠费  1-正常
     *
     * @return state - IC卡状态 -1移除  0-欠费  1-正常
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置IC卡状态 -1移除  0-欠费  1-正常
     *
     * @param state IC卡状态 -1移除  0-欠费  1-正常
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取下发状态 0-未下发 1-已下发
     *
     * @return send_flag - 下发状态 0-未下发 1-已下发
     */
    public Integer getSendFlag() {
        return sendFlag;
    }

    /**
     * 设置下发状态 0-未下发 1-已下发
     *
     * @param sendFlag 下发状态 0-未下发 1-已下发
     */
    public void setSendFlag(Integer sendFlag) {
        this.sendFlag = sendFlag;
    }

    /**
     * 获取写入时间
     *
     * @return write_time - 写入时间
     */
    public Date getWriteTime() {
        return writeTime;
    }

    /**
     * 设置写入时间
     *
     * @param writeTime 写入时间
     */
    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    /**
     * 获取下发时间
     *
     * @return update_time - 下发时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置下发时间
     *
     * @param updateTime 下发时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
}