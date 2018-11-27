package cn.com.cdboost.charge.merchant.service;

import cn.com.cdboost.charge.base.vo.PageData;
import cn.com.cdboost.charge.merchant.common.BaseService;
import cn.com.cdboost.charge.merchant.model.Card;
import cn.com.cdboost.charge.merchant.vo.dto.IcCardListDto;
import cn.com.cdboost.charge.merchant.vo.param.IcCardParam;

/**
 * ic卡单表接口
 */
public interface IIcCardService extends BaseService<Card>{

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
     * 商户注销ic卡
     * @param cardId
     */
    void cancelCard(String cardId);

    /**
     * 分页查询ic卡列表
     * @param param
     * @return
     */
    PageData<IcCardListDto> queryIcList(IcCardParam param);
}
