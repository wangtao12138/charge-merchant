package cn.com.cdboost.charge.merchant.vo.param;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class DeviceQueryParam implements Serializable{
    private static final long serialVersionUID = -127455699308727723L;
    //站点guid
    private String projectGuid;
    //站点编号
    private String deviceNo;
    //设备guid
    private String chargingPlieGuid;
    //商户guid
    private String merchantGuid;
}
