package cn.com.cdboost.charge.merchant.vo.info;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ProjectListInfo implements Serializable {
    private static final long serialVersionUID = 6491771784281372187L;
    //站点标识
    private String projectGuid;
    //站点名称
    private String projectName;
    //站点位置
    private String projectAddr;
    //充电中数量
    private Integer chargingNum = 0;
    //空闲数量
    private Integer freeNum = 0;
    //故障数量
    private Integer faultNum = 0;
    //离线数量
    private Integer offLineNum = 0;
}
