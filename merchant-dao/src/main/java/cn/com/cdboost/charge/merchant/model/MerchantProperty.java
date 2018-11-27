package cn.com.cdboost.charge.merchant.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "cp_d_merchant_property")
public class MerchantProperty implements Serializable {
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
     * 物业标识
     */
    @Column(name = "property_guid")
    private String propertyGuid;

    /**
     * 物业名称
     */
    @Column(name = "property_name")
    private String propertyName;

    /**
     * 联系人员
     */
    @Column(name = "contact_user")
    private String contactUser;

    /**
     * 物业电话
     */
    @Column(name = "property_phone")
    private String propertyPhone;

    /**
     * 物业账户
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 物业密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 物业状态 0-停用1-正常
     */
    @Column(name = "property_state")
    private Integer propertyState;

    /**
     * 物业备注信息
     */
    private String remark;

    /**
     * 首字母拼音
     */
    @Column(name = "first_pinyin")
    private String firstPinyin;

    /**
     * 全拼
     */
    @Column(name = "full_pinyin")
    private String fullPinyin;

    /**
     * 数据有效 1-有效  0-删除
     */
    @Column(name = "is_del")
    private Integer isDel;

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
     * 获取物业标识
     *
     * @return property_guid - 物业标识
     */
    public String getPropertyGuid() {
        return propertyGuid;
    }

    /**
     * 设置物业标识
     *
     * @param propertyGuid 物业标识
     */
    public void setPropertyGuid(String propertyGuid) {
        this.propertyGuid = propertyGuid;
    }

    /**
     * 获取物业名称
     *
     * @return property_name - 物业名称
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * 设置物业名称
     *
     * @param propertyName 物业名称
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
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
     * 获取物业电话
     *
     * @return property_phone - 物业电话
     */
    public String getPropertyPhone() {
        return propertyPhone;
    }

    /**
     * 设置物业电话
     *
     * @param propertyPhone 物业电话
     */
    public void setPropertyPhone(String propertyPhone) {
        this.propertyPhone = propertyPhone;
    }

    /**
     * 获取物业账户
     *
     * @return login_name - 物业账户
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置物业账户
     *
     * @param loginName 物业账户
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取物业密码
     *
     * @return user_password - 物业密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置物业密码
     *
     * @param userPassword 物业密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取物业状态 0-停用1-正常
     *
     * @return property_state - 物业状态 0-停用1-正常
     */
    public Integer getPropertyState() {
        return propertyState;
    }

    /**
     * 设置物业状态 0-停用1-正常
     *
     * @param propertyState 物业状态 0-停用1-正常
     */
    public void setPropertyState(Integer propertyState) {
        this.propertyState = propertyState;
    }

    /**
     * 获取物业备注信息
     *
     * @return remark - 物业备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置物业备注信息
     *
     * @param remark 物业备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取首字母拼音
     *
     * @return first_pinyin - 首字母拼音
     */
    public String getFirstPinyin() {
        return firstPinyin;
    }

    /**
     * 设置首字母拼音
     *
     * @param firstPinyin 首字母拼音
     */
    public void setFirstPinyin(String firstPinyin) {
        this.firstPinyin = firstPinyin;
    }

    /**
     * 获取全拼
     *
     * @return full_pinyin - 全拼
     */
    public String getFullPinyin() {
        return fullPinyin;
    }

    /**
     * 设置全拼
     *
     * @param fullPinyin 全拼
     */
    public void setFullPinyin(String fullPinyin) {
        this.fullPinyin = fullPinyin;
    }

    /**
     * 获取数据有效 1-有效  0-删除
     *
     * @return is_del - 数据有效 1-有效  0-删除
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 设置数据有效 1-有效  0-删除
     *
     * @param isDel 数据有效 1-有效  0-删除
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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