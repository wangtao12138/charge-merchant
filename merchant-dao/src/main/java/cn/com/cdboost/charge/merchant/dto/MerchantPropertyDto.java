package cn.com.cdboost.charge.merchant.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class MerchantPropertyDto {
    /**
     * 商户标识
     */
    private String merchantGuid;

    /**
     * 物业标识
     */
    private String propertyGuid;

    /**
     * 物业名称
     */
    private String propertyName;

    /**
     * 联系人员
     */
    private String contactUser;

    /**
     * 物业电话
     */
    private String propertyPhone;

    /**
     * 物业账户
     */
    private String loginName;

    /**
     * 物业密码
     */
    private String userPassword;

    /**
     * 物业状态 0-停用1-正常
     */
    private Integer propertyState;

    /**
     * 物业备注信息
     */
    private String remark;

    /**
     * 首字母拼音
     */
    private String firstPinyin;

    /**
     * 全拼
     */
    private String fullPinyin;

    /**
     * 数据有效 1-有效  0-删除
     */
    private Integer isDel;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
