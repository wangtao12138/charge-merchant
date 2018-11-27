package cn.com.cdboost.charge.merchant.vo.info;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
@ApiModel(value = "EditSchemeParam",description = "方案添加对象")
public class EditSchemeVo implements Serializable{
    private static final long serialVersionUID = -6150034622743518927L;
    /**
     * 商户标识
     */
    private String merchantGuid;

    /**
     * 项目标识
     */
    private String projectGuid;

    /**
     * 充值类别 1-临时充值  2-包月充值 3-一次充满 4-余额活动充值
     */
    private Integer payCategory;

    /**
     * 充值包月数 pay_category=2时有效
     */
    private Integer numMonths;

    /**
     * 活动实际支付金额 pay_category=4时有效
     */
    private BigDecimal payMoney;

    /**
     * 实得金额
     */
    private BigDecimal realMoney;

    /**
     * 充电时长 0 标识不限,其他标识实时时长,单位小时
     */
    private Integer chargingTime;

    /**
     * 功率类别 0-小功率 1-大功率
     */
    private Integer powerCategory;

    /**
     * 显示排序
     */
    private Integer sortNo;

    /**
     * 方案唯一标识
     */
    private String schemeGuid;

    /**
     * 是否启用（1启用，0禁用）
     */
    private Integer isEnable;

    /**
     *最小功率
     */
    private Integer minPower;
    /**
     * 最大功率
     */
    private Integer maxPower;
    /**
     * 方案类型：0-方案1；1-方案2
     */
    private Integer schemeType;

    /**
     * 月卡次数
     */
    private Integer chargingCnt;

    /**
     * 0-新增 1-删除 2-修改 3-启用或停用
     */
    private Integer flag;
}
