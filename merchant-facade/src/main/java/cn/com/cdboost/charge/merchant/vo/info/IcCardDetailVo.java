package cn.com.cdboost.charge.merchant.vo.info;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ic卡详情vo
 */
@Setter
@Getter
public class IcCardDetailVo implements Serializable{
    private static final long serialVersionUID = -9091123352281052314L;
    /**
     * 商户标识
     */
    private String merchantGuid;

    /**
     * 物业标识
     */
    private String propertyGuid;

    /**
     * 项目标识
     */
    private String projectGuid;
    /**
     * 所属站点名称
     */
    private String projectName;

    /**
     * IC卡所属人员名称
     */
    private String customerName;

    /**
     * IC所属人员电话
     */
    private String customerContact;

    /**
     * ic卡编号
     */
    private String cardId;

    /**
     * ic卡状态 0初始、1 -启用、2-停用
     */
    private Integer cardState;

    /**
     * 使用次数
     */
    private Integer useCnt;

    /**
     * 预置预留
     */
    private BigDecimal initAmount;

    /**
     * 账户余额
     */
    private BigDecimal remainAmount;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 绑定的客户唯一标识
     */
    private String customerGuid;
}
