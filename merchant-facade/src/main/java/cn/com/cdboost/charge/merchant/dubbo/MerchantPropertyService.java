package cn.com.cdboost.charge.merchant.dubbo;

import cn.com.cdboost.charge.base.exception.BusinessException;
import cn.com.cdboost.charge.merchant.vo.info.MerchantPropertyVo;
import cn.com.cdboost.charge.merchant.vo.dto.TodayMerchantInfo;
import cn.com.cdboost.charge.merchant.vo.param.PropertyQueryParam;

import java.util.List;

/**
 * 物业接口
 */
public interface MerchantPropertyService {
     /**
      * 新增物业
      * @param merchantPropertyVo
      */
     void addProperty(MerchantPropertyVo merchantPropertyVo) throws BusinessException;

     /**
      * 修改物业
      * @param merchantPropertyVo
      */
     void updateProperty(MerchantPropertyVo merchantPropertyVo) throws BusinessException;

     /**
      * 删除物业
      * @param propertyGuids
      */
     void deletePropertyByPropertyGuids(List<String> propertyGuids);

     /**
      * 查询商户下物业
      * @param queryVo
      * @return
      */
     List<MerchantPropertyVo> queryAllMerchantProperty(PropertyQueryParam queryVo);

     /**
      * 查询物业详情
      * @param propertyGuid
      * @return
      */
     MerchantPropertyVo queryMerchantProperty(String propertyGuid);

     /**
      * 查询告警数量和代理商数量
      * @param merchantGuid
      * @return
      */
     TodayMerchantInfo queryTodayCount(String merchantGuid);
}
