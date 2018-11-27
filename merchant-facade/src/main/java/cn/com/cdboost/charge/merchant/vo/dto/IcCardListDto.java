package cn.com.cdboost.charge.merchant.vo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ic卡列表返回对象
 */
@Setter
@Getter
public class IcCardListDto implements Serializable{
    private static final long serialVersionUID = 8340112494902191576L;
    /**
     * 站点guid
     */
    private String projectGuid;
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
     * IC卡内部UID
     */
    private String cardGuid;

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
     * IC 卡状态 0 欠费 1正常
     */
    private Integer cardOwe;
}
