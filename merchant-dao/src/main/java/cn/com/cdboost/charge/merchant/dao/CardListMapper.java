package cn.com.cdboost.charge.merchant.dao;

import cn.com.cdboost.charge.merchant.common.CommonMapper;
import cn.com.cdboost.charge.merchant.dto.param.ChargerICCardOptListParam;
import cn.com.cdboost.charge.merchant.dto.param.ICCardListParam;
import cn.com.cdboost.charge.merchant.model.CardList;

public interface CardListMapper extends CommonMapper<CardList> {
    void addDevCardList(ICCardListParam chargingDevice);

    void addCardList(ICCardListParam chargerICCardListParam);

    void optCardList(ChargerICCardOptListParam param);
}