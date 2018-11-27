package cn.com.cdboost.charge.merchant.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "cp_d_merchant_daysta")
public class MerchantDaysta implements Serializable {
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

    /**
     * 年
     */
    @Column(name = "sta_date")
    private Date staDate;

    /**
     * 充电次数
     */
    @Column(name = "charging_cnt")
    private Integer chargingCnt;

    /**
     * 卡充值费用
     */
    @Column(name = "card_pay_money")
    private BigDecimal cardPayMoney;

    /**
     * 总充值费用
     */
    @Column(name = "total_pay_money")
    private BigDecimal totalPayMoney;

    /**
     * 总消耗费用
     */
    @Column(name = "total_money")
    private BigDecimal totalMoney;

    /**
     * 总盈利费用
     */
    @Column(name = "total_profitable")
    private BigDecimal totalProfitable;

    /**
     * 总消耗电量
     */
    @Column(name = "total_power")
    private BigDecimal totalPower;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取年
     *
     * @return sta_date - 年
     */
    public Date getStaDate() {
        return staDate;
    }

    /**
     * 设置年
     *
     * @param staDate 年
     */
    public void setStaDate(Date staDate) {
        this.staDate = staDate;
    }

    /**
     * 获取充电次数
     *
     * @return charging_cnt - 充电次数
     */
    public Integer getChargingCnt() {
        return chargingCnt;
    }

    /**
     * 设置充电次数
     *
     * @param chargingCnt 充电次数
     */
    public void setChargingCnt(Integer chargingCnt) {
        this.chargingCnt = chargingCnt;
    }

    /**
     * 获取卡充值费用
     *
     * @return card_pay_money - 卡充值费用
     */
    public BigDecimal getCardPayMoney() {
        return cardPayMoney;
    }

    /**
     * 设置卡充值费用
     *
     * @param cardPayMoney 卡充值费用
     */
    public void setCardPayMoney(BigDecimal cardPayMoney) {
        this.cardPayMoney = cardPayMoney;
    }

    /**
     * 获取总充值费用
     *
     * @return total_pay_money - 总充值费用
     */
    public BigDecimal getTotalPayMoney() {
        return totalPayMoney;
    }

    /**
     * 设置总充值费用
     *
     * @param totalPayMoney 总充值费用
     */
    public void setTotalPayMoney(BigDecimal totalPayMoney) {
        this.totalPayMoney = totalPayMoney;
    }

    /**
     * 获取总消耗费用
     *
     * @return total_money - 总消耗费用
     */
    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    /**
     * 设置总消耗费用
     *
     * @param totalMoney 总消耗费用
     */
    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * 获取总盈利费用
     *
     * @return total_profitable - 总盈利费用
     */
    public BigDecimal getTotalProfitable() {
        return totalProfitable;
    }

    /**
     * 设置总盈利费用
     *
     * @param totalProfitable 总盈利费用
     */
    public void setTotalProfitable(BigDecimal totalProfitable) {
        this.totalProfitable = totalProfitable;
    }

    /**
     * 获取总消耗电量
     *
     * @return total_power - 总消耗电量
     */
    public BigDecimal getTotalPower() {
        return totalPower;
    }

    /**
     * 设置总消耗电量
     *
     * @param totalPower 总消耗电量
     */
    public void setTotalPower(BigDecimal totalPower) {
        this.totalPower = totalPower;
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
}