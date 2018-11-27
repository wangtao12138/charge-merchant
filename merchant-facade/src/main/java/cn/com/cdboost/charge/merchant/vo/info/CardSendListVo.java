package cn.com.cdboost.charge.merchant.vo.info;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * ic卡下发列表
 */
@Getter
@Setter
public class CardSendListVo implements Serializable{
    private static final long serialVersionUID = -8601163210962719564L;
    /**
     * 设备编号
     */
    private String deviceNo;

    /**
     * 设备deveui
     */
    private String commNo;

    /**
     * ic卡编号
     */
    private String cardId;

    /**
     *IC卡状态 -1移除  0-欠费  1-正常
     */
    private Integer state;

    private Integer pointCode;

    /**
     *IC卡状态 -1移除  0-欠费  1-正常
     */
    private Integer sendFlag;

    /**
     * 下发时间
     */
    private String updateTime;

    private String cardGuid;


}
