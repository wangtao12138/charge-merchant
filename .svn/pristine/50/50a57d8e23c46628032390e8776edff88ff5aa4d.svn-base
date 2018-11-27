package cn.com.cdboost.charge.merchant.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "cp_d_merchant_makecard")
public class MerchantMakecard implements Serializable {
    /**
     * 标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目标识
     */
    @Column(name = "project_guid")
    private String projectGuid;

    /**
     * 商户标识
     */
    @Column(name = "merchant_guid")
    private String merchantGuid;

    /**
     * IC卡数量
     */
    @Column(name = "card_cnt")
    private Integer cardCnt;

    /**
     * 每张卡初始金额
     */
    @Column(name = "init_amount")
    private BigDecimal initAmount;

    /**
     * 邮寄联系电话
     */
    @Column(name = "contact_phone")
    private String contactPhone;

    /**
     * 联系人员
     */
    @Column(name = "contact_user")
    private String contactUser;

    /**
     * l联系地址信息
     */
    @Column(name = "contact_addr")
    private String contactAddr;

    /**
     * 合计金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 费用支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 0 待支付费用 1-正在制卡 2-完成申请
     */
    @Column(name = "apply_state")
    private Integer applyState;

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
     * 获取IC卡数量
     *
     * @return card_cnt - IC卡数量
     */
    public Integer getCardCnt() {
        return cardCnt;
    }

    /**
     * 设置IC卡数量
     *
     * @param cardCnt IC卡数量
     */
    public void setCardCnt(Integer cardCnt) {
        this.cardCnt = cardCnt;
    }

    /**
     * 获取每张卡初始金额
     *
     * @return init_amount - 每张卡初始金额
     */
    public BigDecimal getInitAmount() {
        return initAmount;
    }

    /**
     * 设置每张卡初始金额
     *
     * @param initAmount 每张卡初始金额
     */
    public void setInitAmount(BigDecimal initAmount) {
        this.initAmount = initAmount;
    }

    /**
     * 获取邮寄联系电话
     *
     * @return contact_phone - 邮寄联系电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置邮寄联系电话
     *
     * @param contactPhone 邮寄联系电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取联系人员
     *
     * @return contact_user - 联系人员
     */
    public String getContactUser() {
        return contactUser;
    }

    /**
     * 设置联系人员
     *
     * @param contactUser 联系人员
     */
    public void setContactUser(String contactUser) {
        this.contactUser = contactUser;
    }

    /**
     * 获取l联系地址信息
     *
     * @return contact_addr - l联系地址信息
     */
    public String getContactAddr() {
        return contactAddr;
    }

    /**
     * 设置l联系地址信息
     *
     * @param contactAddr l联系地址信息
     */
    public void setContactAddr(String contactAddr) {
        this.contactAddr = contactAddr;
    }

    /**
     * 获取合计金额
     *
     * @return total_amount - 合计金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置合计金额
     *
     * @param totalAmount 合计金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取费用支付时间
     *
     * @return pay_time - 费用支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置费用支付时间
     *
     * @param payTime 费用支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取0 待支付费用 1-正在制卡 2-完成申请
     *
     * @return apply_state - 0 待支付费用 1-正在制卡 2-完成申请
     */
    public Integer getApplyState() {
        return applyState;
    }

    /**
     * 设置0 待支付费用 1-正在制卡 2-完成申请
     *
     * @param applyState 0 待支付费用 1-正在制卡 2-完成申请
     */
    public void setApplyState(Integer applyState) {
        this.applyState = applyState;
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