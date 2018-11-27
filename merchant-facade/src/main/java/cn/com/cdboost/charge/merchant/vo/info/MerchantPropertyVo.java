package cn.com.cdboost.charge.merchant.vo.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@ApiModel(value = "MerchantPropertyVo", description = "物业对象")
public class MerchantPropertyVo  implements Serializable {

    private static final long serialVersionUID = -3318675195692907810L;
    @ApiModelProperty(value = "商户标识")
    private String merchantGuid;

    @ApiModelProperty(value = "物业标识")
    private String propertyGuid;

    @ApiModelProperty(value = "物业名称")
    private String propertyName;

    @ApiModelProperty(value = "联系人员")
    private String contactUser;

    @ApiModelProperty(value = "物业电话")
    private String propertyPhone;

    @ApiModelProperty(value = "物业账户")
    private String loginName;

    @ApiModelProperty(value = "物业密码")
    private String userPassword;

    @ApiModelProperty(value = "物业状态 0-停用1-正常")
    private Integer propertyState;

    @ApiModelProperty(value = "物业备注信息")
    private String remark;

    @ApiModelProperty(value = "首字母拼音")
    private String firstPinyin;

    @ApiModelProperty(value = "全拼")
    private String fullPinyin;

    @ApiModelProperty(value = "数据有效 1-有效  0-删除")
    private Integer isDel;

    @ApiModelProperty(value = "创建时间")
    private String createTime;

    @ApiModelProperty(value = "更新时间")
    private String updateTime;
}
