package cn.com.cdboost.charge.merchant.vo.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@ApiModel(value = "DeviceCountByRunStateVo", description = "商户设备使用情况统计")
public class DeviceCountByRunStateVo implements Serializable{
    private static final long serialVersionUID = 5226718464191730186L;
    @ApiModelProperty(value = "充电中数量")
    private Integer onTotal;
    @ApiModelProperty(value = "在线数量")
    private Integer onlineTotal;
    @ApiModelProperty(value = "总数")
    private Integer total;
    @ApiModelProperty(value = "离线数量")
    private Integer offlineTotal;
}
