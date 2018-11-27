package cn.com.cdboost.charge.merchant.vo.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class PropertyQueryParam implements Serializable{

    private static final long serialVersionUID = 3142235269563435741L;
    @ApiModelProperty(value = "商户guid")
    private String merchantGuid;

    @ApiModelProperty(value = "物业名称")
    private String propertyName;
}
