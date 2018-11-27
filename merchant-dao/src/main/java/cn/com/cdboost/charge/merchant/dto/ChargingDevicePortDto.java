package cn.com.cdboost.charge.merchant.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChargingDevicePortDto {
    private String chargingPlieGuid;
    private String deviceNo;
    private Integer runState;
    private String commNo;
    private String port;
}
