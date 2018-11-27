package cn.com.cdboost.charge.merchant.dubbo;

import cn.com.cdboost.charge.base.exception.BusinessException;
import cn.com.cdboost.charge.base.vo.PageData;
import cn.com.cdboost.charge.merchant.vo.dto.IcCardListDto;
import cn.com.cdboost.charge.merchant.vo.info.*;
import cn.com.cdboost.charge.merchant.vo.param.ChargerICCardListParam;
import cn.com.cdboost.charge.merchant.vo.param.IcCardParam;

import java.util.List;

/**
 * ic卡接口
 */
public interface IcCardService {
    /**
     * 统计IC卡数量
     * @param param
     * @return
     */
    IcCardCountVo queryIcCount(IcCardParam param);

    /**
     * 查询ic卡详情
     * @param cardId
     * @return
     */
    IcCardDetailVo queryIcDetail(String cardId);

    /**
     * 查询ic卡列表
     * @param param
     * @return
     */
    PageData<IcCardListDto> queryIcList(IcCardParam param);

    /**
     * 商户绑定ic卡到站点
     * @param merchantGuid
     * @param projectGuid
     * @param cardId
     */
    void bindingProject(String merchantGuid, String projectGuid, String cardId) throws BusinessException;

    /**
     * 商户注销ic卡
     * @param cardId
     */
    void cancelCard(String cardId);

    /**
     * 添加ic卡
     * @param addVo
     */
    void addCard(ChargerICCardAddVo addVo) throws BusinessException;

    //添加ic卡下发表
    void addCardList(ChargerICCardListParam listParam);

    /**
     * 修改ic卡
     * @param addVo
     */
    void editCard(ChargerICCardEditVo addVo);

    //修改ic卡下发表
    void editCardList(ChargerICCardListParam listParam);

    /**
     * 删除ic卡
     * @param cardIds
     */
    void deleteCards(List<String> cardIds) throws BusinessException;

    /**
     * 删除ic卡下发表
     * @param cardIds
     */
    void deleteCardList(List<String> cardIds);

    /**
     * 停用或启用ic卡
     * @param cardIds
     * @param onOrOff
     */
    void offOnCard(List<String> cardIds,Integer onOrOff);

    /**
     * 停用启用ic卡修改下发表
     * @param cardIds
     * @param onOrOff
     */
    void offOnCardList(List<String> cardIds,Integer onOrOff);

    /**
     * 查询ic卡下发列表
     * @param param
     * @return
     */
    PageData<CardSendListVo> queryIcSendList(IcCardParam param);

}
