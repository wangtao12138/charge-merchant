package cn.com.cdboost.charge.merchant.vo.dto;

import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

/**
 * @author boost
 */
public class TotalLineLossDto extends QueryListParamDate {

    @NotBlank(message = "deviceNo不能为null")
    private String deviceNo;
    @NotBlank(message = "deviceType不能为null")
    private String deviceType;
    private String endDateLast;
    private String deviceCno;

    private String nodeId;
    private Integer nodeType;
    private List<Long> orgNoList;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public List<Long> getOrgNoList() {
        return orgNoList;
    }

    public void setOrgNoList(List<Long> orgNoList) {
        this.orgNoList = orgNoList;
    }

    public String getEndDateLast() {
        return endDateLast;
    }

    public void setEndDateLast(String endDateLast) {
        this.endDateLast = endDateLast;
    }

    public String getDeviceCno() {
        return deviceCno;
    }

    public void setDeviceCno(String deviceCno) {
        this.deviceCno = deviceCno;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }


}
