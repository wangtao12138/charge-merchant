package cn.com.cdboost.charge.merchant.vo.info;



import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

/**
 * 方案返回
 */
@Setter
@Getter
public class ChargerSchemeVo implements Serializable{
    private static final long serialVersionUID = 7433468123580236690L;

    private String projectGuid;

    private Integer minPower;

    private Integer maxPower;
    //充电方案
    @Valid
    private List<ChargingSchemeDto> schemeList;
}
