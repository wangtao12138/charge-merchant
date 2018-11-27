package cn.com.cdboost.charge.merchant.vo.param;

import cn.com.cdboost.charge.base.vo.PageQueryParam;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DevicePageQueryParam extends PageQueryParam implements Serializable {
    private static final long serialVersionUID = -1017765868026045211L;
    //站点guid
    private String projectGuid;
    //站点编号
    private String deviceNo;
    //设备guid
    private String chargingPlieGuid;
    //商户guid
    private String merchantGuid;
}
