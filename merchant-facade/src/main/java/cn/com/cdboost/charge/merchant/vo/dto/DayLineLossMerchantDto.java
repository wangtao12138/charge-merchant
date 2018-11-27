package cn.com.cdboost.charge.merchant.vo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author wt
 * @desc
 * @create in  2018/8/11
 **/
@Getter
@Setter
public class DayLineLossMerchantDto implements Serializable{
    private String deviceNo;
    private String deviceType;
    private String date;

    private String deviceCno;


}
