package cn.com.cdboost.charge.merchant.dao;

import cn.com.cdboost.charge.merchant.common.CommonMapper;
import cn.com.cdboost.charge.merchant.dto.*;
import cn.com.cdboost.charge.merchant.dto.param.ChargerDeviceParam;
import cn.com.cdboost.charge.merchant.dto.param.ChargerDeviceQueryDaoParam;
import cn.com.cdboost.charge.merchant.dto.param.DeviceQueryParam;
import cn.com.cdboost.charge.merchant.model.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper extends CommonMapper<Device> {
    List<ChargingDevicePortDto> deviceAndPortList(@Param("deviceNos") List<String> deviceNos);
    /**
     * 查询设备列表
     * @param queryVo
     * @return
     */
    List<ChargingDeviceDto> deviceList(DeviceQueryParam queryVo);

    /**
     * 查询设备列表总数
     * @param queryVo
     * @return
     */
    Integer queryTotal(DeviceQueryParam queryVo);

    /**
     * 查询设备详情
     * @param chargingPlieGuid
     * @return
     */
    ChargingDeviceDto queryDeviceDetial(@Param("chargingPlieGuid") String chargingPlieGuid);

    int editDevice(Device chargingDevice);

    List<MonitorDeviceTotalDto> monitorDeviceCount(ChargerDeviceParam queryVo);

    List<MonitorDeviceDaoDto> monitorDeviceList(ChargerDeviceQueryDaoParam queryVo);

    List<MonitorDeviceDaoDto> notChargingAndChargingDevice(ChargerDeviceQueryDaoParam queryVo);

    List<String> queryMeterNo(ElectricCountQueryDto queryVo);

}