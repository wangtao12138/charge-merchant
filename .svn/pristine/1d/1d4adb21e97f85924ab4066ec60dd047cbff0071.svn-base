package cn.com.cdboost.charge.merchant.dto.param;

import cn.com.cdboost.charge.base.vo.PageQueryParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * ic卡查询参数
 */
@Setter
@Getter
public class IcCardQueryParam extends PageQueryParam{
    @ApiModelProperty(value = "商户guid")
    private String merchantGuid;

    @ApiModelProperty(value = "站点guid")
    private String projectGuid;

    @ApiModelProperty(value = "卡号")
    private String cardId;

    @ApiModelProperty(value = "卡状态：0初始、1 -启用、2-停用、3-挂失")
    private Integer cardState;

    @ApiModelProperty(value = "IC 卡状态 0 欠费 1正常")
    private Integer cardOwe;

    private Integer pageIndex;
}
