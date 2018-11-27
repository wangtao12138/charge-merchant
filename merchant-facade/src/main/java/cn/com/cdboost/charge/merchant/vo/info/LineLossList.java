package cn.com.cdboost.charge.merchant.vo.info;

import java.io.Serializable;

public class LineLossList implements Serializable{

    private String date;
    private String deviceNo;
    private String meterElect;
    private String deviceElect;
    private String lossPower;
    private String lossRate;
    private String chargeTime;
    private String installAddr;
    private String lastReadValue;
    private String readValue;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getMeterElect() {
        return meterElect;
    }

    public void setMeterElect(String meterElect) {
        this.meterElect = meterElect;
    }

    public String getDeviceElect() {
        return deviceElect;
    }

    public void setDeviceElect(String deviceElect) {
        this.deviceElect = deviceElect;
    }

    public String getLossPower() {
        return lossPower;
    }

    public void setLossPower(String lossPower) {
        this.lossPower = lossPower;
    }

    public String getLossRate() {
        return lossRate;
    }

    public void setLossRate(String lossRate) {
        this.lossRate = lossRate;
    }

    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }

    public String getInstallAddr() {
        return installAddr;
    }

    public void setInstallAddr(String installAddr) {
        this.installAddr = installAddr;
    }

    public String getLastReadValue() {
        return lastReadValue;
    }

    public void setLastReadValue(String lastReadValue) {
        this.lastReadValue = lastReadValue;
    }

    public String getReadValue() {
        return readValue;
    }

    public void setReadValue(String readValue) {
        this.readValue = readValue;
    }
}