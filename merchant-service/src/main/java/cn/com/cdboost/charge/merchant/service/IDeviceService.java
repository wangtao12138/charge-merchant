package cn.com.cdboost.charge.merchant.service;


import cn.com.cdboost.charge.merchant.common.BaseService;
import cn.com.cdboost.charge.merchant.model.Device;
import cn.com.cdboost.charge.merchant.vo.info.DeviceVo;
import cn.com.cdboost.charge.merchant.vo.param.DevicePageQueryParam;

import java.util.List;

/**
 * 充电设备接口
 */
public interface IDeviceService extends BaseService<Device> {
    /**
     * 条件查询设备列表
     * @param queryParam
     * @return
     */
    List<Device> queryDevicesByCondition(DevicePageQueryParam queryParam);

    /**
     * 通过ChargingPlieGuid修改设备
     * @param deviceVo
     */
    void updateByChargingPlieGuid(DeviceVo deviceVo);

    /**
     * 通过deviceNo修改设备
     * @param deviceVo
     */
    void updateByDeviceNo(DeviceVo deviceVo);

    /**
     * 批量删除设备
     * @param deviceNos
     */
    void batchDelete(List<String> deviceNos);

    /**
     * 批量查询设备
     * @param chargingPlieGuids
     */
    List<Device> queryDevices(List<String> chargingPlieGuids);
}
