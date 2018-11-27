package cn.com.cdboost.charge.merchant.vo.info;

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
public class DayLineLossInfoMerchantimport implements Serializable{
    private String date;
    private String voltageA;
    private String currentA;


}
