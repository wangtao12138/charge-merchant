package cn.com.cdboost.charge.merchant.vo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ChargingCountByRunState implements Serializable {

    private Integer errorTotal;

    private Integer freeTotal;

    private Integer onTotal;

    private Integer offTotal;

    private Integer total;

    private Integer offlineTotal;

}
