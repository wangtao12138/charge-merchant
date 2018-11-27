package cn.com.cdboost.charge.merchant.vo.info;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ApiModel(value = "MerchantInfoVo", description = "商户对象")
public class MerchantInfoVo  implements Serializable {

    private static final long serialVersionUID = 2019800750228335471L;

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
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String lastLoginTime;

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
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String createTime;

    /**
     * 更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String updateTime;

    /**
     * 数据有效 0-无效  1-有效
     */
    private Integer isDel;

    /**
     * 组织结构标识
     */
    private Long orgNo;

    /**
     * 博高利润分账比例
     */
    private BigDecimal profitRatio;

    /**
     * 每笔充电服务费收取比例
     */
    private BigDecimal serviceRatio;

    /**
     * 充电结束，给用户退款比例
     */
    private BigDecimal refundRatio;

    /**
     * 服务模式（0普通商户模式，1服务商模式）
     */
    private Integer serviceMode;
}
