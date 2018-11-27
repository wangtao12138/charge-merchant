package cn.com.cdboost.charge.merchant.dto.param;

import cn.com.cdboost.charge.base.vo.PageQueryParam;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ProjectQueryParamDao extends PageQueryParam implements Serializable {
    private static final long serialVersionUID = 6852017388184290015L;
    //物业guid
    private String propertyGuid;
    //站点名称
    private String projectName;
    //商户guid
    private String merchantGuid;
    //商户guid
    private Integer pageIndex;
}
