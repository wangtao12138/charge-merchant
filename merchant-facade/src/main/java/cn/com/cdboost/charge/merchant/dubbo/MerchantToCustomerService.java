package cn.com.cdboost.charge.merchant.dubbo;

import cn.com.cdboost.charge.base.exception.BusinessException;
import cn.com.cdboost.charge.merchant.vo.info.*;
import cn.com.cdboost.charge.merchant.vo.param.CustomerChargingParam;
import cn.com.cdboost.charge.merchant.vo.param.DeviceQueryParam;

import java.util.List;

/**
 * 商户服务提供给客户 服务接口
 */
public interface MerchantToCustomerService {
    /**
     * 查询设备
     * @param queryParam
     * @return
     */
    DeviceRelationVo queryDevice(DeviceQueryParam queryParam);

    /**
     * 批量查询设备
     * @param chargingPlieGuids
     */
    List<DeviceRelationVo> queryDevices(List<String> chargingPlieGuids);

    /**
     * 用户绑定ic卡
     * @param cardId
     * @param customerGuid
     */
    void bindingCustomer(String cardId,String customerGuid,String userPhone);

    /**
     * 用户解绑ic卡
     * @param cardId
     */
    void unbind(String cardId);

    /**
     * 根据customerGuid查询所绑定的iC卡列表
     * @param customerGuid
     * @return
     */
    List<IcCardDetailVo> queryCardList(String customerGuid);

    /**
     * 批量查询站点
     * @param projectGuids
     */
    List<ProjectVo> queryProjects(List<String> projectGuids);
    /**
     * 开电查询方案相关信息
     * @param param
     * @return
     */
    ChargingSchemeDeviceVo queryChargeDeviceSchemeInfo(CustomerChargingParam param) throws BusinessException;
}
