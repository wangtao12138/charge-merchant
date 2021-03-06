package cn.com.cdboost.charge.merchant.vo.param;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class MerchantQueryParam implements Serializable{
    private static final long serialVersionUID = -951895524015768089L;
    /**
     * 商户标识
     */
    private String merchantGuid;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 商户电话
     */
    private String merchantPhone;

    /**
     * 微信号
     */
    private String webchartNo;

    /**
     * 支付宝号
     */
    private String alipayNo;

    /**
     * 最近一次登录时间
     */
    private Date lastLoginTime;

    /**
     * 商户状态 1-正常
     */
    private Integer merchartState;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 数据有效 0-无效  1-有效
     */
    private Integer isDel;

    /**
     * 组织结构标识
     */
    private Long orgNo;

    private Integer userId;
}
