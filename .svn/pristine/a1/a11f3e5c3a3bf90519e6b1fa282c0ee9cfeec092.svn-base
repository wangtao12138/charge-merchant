package cn.com.cdboost.charge.merchant.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "cp_d_com_pay_cheme")
public class ComPayCheme implements Serializable {
    /**
     * 标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 充值类别 1-临时充值  2-包月充值 3--次充满 4-余额活动充值
     */
    @Column(name = "pay_category")
    private Integer payCategory;

    /**
     * 充值包月数 pay_category=2 时有效
     */
    @Column(name = "num_months")
    private Integer numMonths;

    /**
     * 活动实际支付金额 pay_category=4时有效
     */
    @Column(name = "pay_money")
    private BigDecimal payMoney;

    /**
     * 实得充值金额
     */
    @Column(name = "real_money")
    private BigDecimal realMoney;

    /**
     * 充电时长 0 标识不限 其他标识实时时长,单位小时
     */
    @Column(name = "charging_time")
    private Integer chargingTime;

    /**
     * 使用次数
     */
    @Column(name = "charging_cnt")
    private Integer chargingCnt;

    /**
     * 功率类别 0-小功率 1-大功率
     */
    @Column(name = "power_category")
    private Integer powerCategory;

    /**
     * 显示排序
     */
    @Column(name = "sort_no")
    private Integer sortNo;

    /**
     *最小功率
     */
    @Column(name = "min_power")
    private Integer minPower;
    /**
     * 最大功率
     */
    @Column(name = "max_power")
    private Integer maxPower;

    /**
     * 方案类型 1-初始化 2-客户自定义
     */
    @Column(name = "cheme_type")
    private Integer chemeType;

    /**
     * 方案唯一标识
     */
    @Column(name = "scheme_guid")
    private String schemeGuid;

    /**
     * 是否启用（1启用，0禁用）
     */
    @Column(name = "is_enable")
    private Integer isEnable;

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
     * 获取充值类别 1-临时充值  2-包月充值 3--次充满 4-余额活动充值
     *
     * @return pay_category - 充值类别 1-临时充值  2-包月充值 3--次充满 4-余额活动充值
     */
    public Integer getPayCategory() {
        return payCategory;
    }

    /**
     * 设置充值类别 1-临时充值  2-包月充值 3--次充满 4-余额活动充值
     *
     * @param payCategory 充值类别 1-临时充值  2-包月充值 3--次充满 4-余额活动充值
     */
    public void setPayCategory(Integer payCategory) {
        this.payCategory = payCategory;
    }

    /**
     * 获取充值包月数 pay_category=2 时有效
     *
     * @return num_months - 充值包月数 pay_category=2 时有效
     */
    public Integer getNumMonths() {
        return numMonths;
    }

    /**
     * 设置充值包月数 pay_category=2 时有效
     *
     * @param numMonths 充值包月数 pay_category=2 时有效
     */
    public void setNumMonths(Integer numMonths) {
        this.numMonths = numMonths;
    }

    /**
     * 获取活动实际支付金额 pay_category=4时有效
     *
     * @return pay_money - 活动实际支付金额 pay_category=4时有效
     */
    public BigDecimal getPayMoney() {
        return payMoney;
    }

    /**
     * 设置活动实际支付金额 pay_category=4时有效
     *
     * @param payMoney 活动实际支付金额 pay_category=4时有效
     */
    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    /**
     * 获取实得充值金额
     *
     * @return real_money - 实得充值金额
     */
    public BigDecimal getRealMoney() {
        return realMoney;
    }

    /**
     * 设置实得充值金额
     *
     * @param realMoney 实得充值金额
     */
    public void setRealMoney(BigDecimal realMoney) {
        this.realMoney = realMoney;
    }

    /**
     * 获取充电时长 0 标识不限 其他标识实时时长,单位小时
     *
     * @return charging_time - 充电时长 0 标识不限 其他标识实时时长,单位小时
     */
    public Integer getChargingTime() {
        return chargingTime;
    }

    /**
     * 设置充电时长 0 标识不限 其他标识实时时长,单位小时
     *
     * @param chargingTime 充电时长 0 标识不限 其他标识实时时长,单位小时
     */
    public void setChargingTime(Integer chargingTime) {
        this.chargingTime = chargingTime;
    }

    /**
     * 获取使用次数
     *
     * @return charging_cnt - 使用次数
     */
    public Integer getChargingCnt() {
        return chargingCnt;
    }

    /**
     * 设置使用次数
     *
     * @param chargingCnt 使用次数
     */
    public void setChargingCnt(Integer chargingCnt) {
        this.chargingCnt = chargingCnt;
    }

    /**
     * 获取功率类别 0-小功率 1-大功率
     *
     * @return power_category - 功率类别 0-小功率 1-大功率
     */
    public Integer getPowerCategory() {
        return powerCategory;
    }

    /**
     * 设置功率类别 0-小功率 1-大功率
     *
     * @param powerCategory 功率类别 0-小功率 1-大功率
     */
    public void setPowerCategory(Integer powerCategory) {
        this.powerCategory = powerCategory;
    }

    /**
     * 获取显示排序
     *
     * @return sort_no - 显示排序
     */
    public Integer getSortNo() {
        return sortNo;
    }

    /**
     * 设置显示排序
     *
     * @param sortNo 显示排序
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * 获取方案类型 1-初始化 2-客户自定义
     *
     * @return cheme_type - 方案类型 1-初始化 2-客户自定义
     */
    public Integer getChemeType() {
        return chemeType;
    }

    /**
     * 设置方案类型 1-初始化 2-客户自定义
     *
     * @param chemeType 方案类型 1-初始化 2-客户自定义
     */
    public void setChemeType(Integer chemeType) {
        this.chemeType = chemeType;
    }

    /**
     * 获取方案唯一标识
     *
     * @return scheme_guid - 方案唯一标识
     */
    public String getSchemeGuid() {
        return schemeGuid;
    }

    /**
     * 设置方案唯一标识
     *
     * @param schemeGuid 方案唯一标识
     */
    public void setSchemeGuid(String schemeGuid) {
        this.schemeGuid = schemeGuid;
    }

    /**
     * 获取是否启用（1启用，0禁用）
     *
     * @return is_enable - 是否启用（1启用，0禁用）
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    /**
     * 设置是否启用（1启用，0禁用）
     *
     * @param isEnable 是否启用（1启用，0禁用）
     */
    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
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

    public Integer getMinPower() {
        return minPower;
    }

    public void setMinPower(Integer minPower) {
        this.minPower = minPower;
    }

    public Integer getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(Integer maxPower) {
        this.maxPower = maxPower;
    }
}