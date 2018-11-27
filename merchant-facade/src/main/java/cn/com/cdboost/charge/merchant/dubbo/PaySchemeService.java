package cn.com.cdboost.charge.merchant.dubbo;

import cn.com.cdboost.charge.merchant.vo.info.ChargerSchemeVo;
import cn.com.cdboost.charge.merchant.vo.info.PaySchemeVo;
import cn.com.cdboost.charge.merchant.vo.info.SchemeEditVo;

import java.util.List;

/**
 * 充电方案接口
 */
public interface PaySchemeService {
    /**
     * 根据schemeGuid查询方案
     * @param schemeGuid
     * @return
     */
    PaySchemeVo queryPaySchemeBySchemeGuid(String schemeGuid);

    // 充电页面，查询价格方案
    List<PaySchemeVo> querySchemeList4ChargePage(String projectGuid);

    // 查询方案二列表
    List<PaySchemeVo> querySchemeTwoList(String projectGuid);

    // 查询方案4列表
    List<PaySchemeVo> querySchemeList4ActivityPage();

    /**
     * 编辑方案
     * @param param
     */
    void editScheme(SchemeEditVo param);

    /**
     * 停用或启用方案
     * @param schemeGuid
     * @param onOrOff
     */
    void offOnScheme(String schemeGuid, Integer onOrOff);

    /**
     * 查询站点下方案列表
     * @param projectGuid
     * @param schemeType
     * @return
     */
    List<ChargerSchemeVo> querySchemeList(String projectGuid, Integer schemeType);
}
