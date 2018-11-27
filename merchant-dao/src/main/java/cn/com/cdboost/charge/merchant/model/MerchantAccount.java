package cn.com.cdboost.charge.merchant.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "cp_d_merchant_account")
public class MerchantAccount implements Serializable {
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
     * 账户名称
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 账号
     */
    @Column(name = "account_no")
    private String accountNo;

    /**
     * 账户类型  1 -微信 2-支付宝 3-银行卡
     */
    @Column(name = "account_type")
    private Integer accountType;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人员
     */
    @Column(name = "update_user")
    private String updateUser;

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
     * 获取账户名称
     *
     * @return account_name - 账户名称
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置账户名称
     *
     * @param accountName 账户名称
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取账号
     *
     * @return account_no - 账号
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 设置账号
     *
     * @param accountNo 账号
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 获取账户类型  1 -微信 2-支付宝 3-银行卡
     *
     * @return account_type - 账户类型  1 -微信 2-支付宝 3-银行卡
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 设置账户类型  1 -微信 2-支付宝 3-银行卡
     *
     * @param accountType 账户类型  1 -微信 2-支付宝 3-银行卡
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
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
     * 获取更新人员
     *
     * @return update_user - 更新人员
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新人员
     *
     * @param updateUser 更新人员
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
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