package cn.com.cdboost.charge.merchant.dubbo;

/**
 * @author wt
 * @desc
 * @create in  2018/10/10
 **/



import cn.com.cdboost.charge.base.exception.BusinessException;
import cn.com.cdboost.charge.base.vo.PageData;

import cn.com.cdboost.charge.merchant.vo.dto.ChargingCountByRunState;
import cn.com.cdboost.charge.merchant.vo.dto.MonitorDeviceDto;
import cn.com.cdboost.charge.merchant.vo.info.*;
import cn.com.cdboost.charge.merchant.vo.param.ChargerDeviceQueryParam;
import cn.com.cdboost.charge.merchant.vo.param.DeviceParam;
import cn.com.cdboost.charge.merchant.vo.param.WithdrawCashListParam;

import java.util.List;

/**
 * web端充电设备管理接口
 */
public interface WebChargingDeviceService {

    PageData deviceList(ChargerDeviceQueryParam queryParam, Integer userId);

    void addDevice(DeviceParam chargingDevice, Integer userId)throws BusinessException;

    //添加ic卡下发表
    void addCardList(DeviceParam chargingDevice);

    boolean deleteDevice(List<String> chargingPlieGuids, Integer userId);

    //删除ic卡下发表
    void deleteCardList(List<String> deviceNos);

    ChargingDeviceVo queryDeviceDetial(String chargingPlieGuid);

    ChargingDeviceVo queryByChargingPlieGuid(String chargingPlieGuid);


    public PageData withdrawCashList(WithdrawCashListParam withdrawCashListDto);

    public boolean editDevice(DeviceVo chargingDevice, Integer userId) ;

    public Integer editCardList(DeviceVo chargingDevice, String oldProjectGuid) ;

    //查询充电桩心跳间隔
    void queryHeartStep(String id, String commNo);

    //设置充电桩心跳间隔
    void setHeartStep(String id, ChargeHeartStepVo chargeHeartStepVo);

    //查询充电桩阈值
    public void queryThreshold(String sessionId, String commNo, String port);

    //设置充电桩阈值
    void setThreshold(String sessionId, ChargeThresholdVo chargeThresholdVo);

    public void offOnCharge(OffOnChargeVo offOnChargeVo);

    ChargingCountByRunState monitorDeviceCount(ChargerDeviceVo queryVo);

    PageData monitorDeviceList(ChargerDeviceQueryMerchantVo queryVo);

    /**
     * 查询电压电流公率曲线
     * @param sessionId
     * @param chargingPlieGuid
     * @param chargingGuid
     * @param queryFlag  1--监控页曲线；2--统计页曲线
     * @return
     */
    CurveQueryInfo queryCurve(String sessionId, String chargingPlieGuid, String chargingGuid, Integer queryFlag);
}
