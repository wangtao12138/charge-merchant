package cn.com.cdboost.charge.merchant.service;

import cn.com.cdboost.charge.merchant.common.BaseService;
import cn.com.cdboost.charge.merchant.model.MerchantProperty;
import cn.com.cdboost.charge.merchant.vo.info.MerchantPropertyVo;
import cn.com.cdboost.charge.merchant.vo.dto.TodayMerchantInfo;

import java.util.List;

/**
 * 物业接口
 */
public interface IMerchantPropertyService extends BaseService<MerchantProperty>{
    /**
     * 修改物业
     * @param merchantPropertyVo
     */
    void updateByPropertuGuid(MerchantPropertyVo merchantPropertyVo);

    /**
     * 批量删除物业
     * @param propertyGuids
     */
    void batchDelete(List<String> propertyGuids);

    /**
     * 查询告警数量和代理商数量
     * @param merchantGuid
     * @return
     */
    TodayMerchantInfo queryTodayCount(String merchantGuid);
}
