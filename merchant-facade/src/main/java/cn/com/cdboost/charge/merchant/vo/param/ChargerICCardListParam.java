package cn.com.cdboost.charge.merchant.vo.param;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ChargerICCardListParam implements Serializable {
    private static final long serialVersionUID = 506294423702793167L;
    private String cardId;

    private String projectGuid;

    private String oldProjectGuid;

    private String deviceNo;

    private String commNo;

    private Integer result;

}
