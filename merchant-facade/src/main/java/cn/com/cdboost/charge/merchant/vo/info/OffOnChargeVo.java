package cn.com.cdboost.charge.merchant.vo.info;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OffOnChargeVo implements Serializable{
    /**
     * 通信编号
     */
    private String commNo;
    private String deviceNo;
    private String port;
    //停用或启用标识（0-停用；1-启用;-1 停电）
    private Integer onOrOff;
    private String chargingGuid;

    private String sessionId;


}
