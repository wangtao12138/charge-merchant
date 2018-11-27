package cn.com.cdboost.charge.merchant.vo.info;

import java.io.Serializable;
import java.util.List;

/**
 * @author boost
 */
public class TotalLineLossInfo implements Serializable{
    private List<LineLossCurve> loss;
    private List<LineLossList> list;
    private LineLossStatistics statistics;
    private Long total;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<LineLossCurve> getLoss() {
        return loss;
    }

    public void setLoss(List<LineLossCurve> loss) {
        this.loss = loss;
    }

    public List<LineLossList> getList() {
        return list;
    }

    public void setList(List<LineLossList> list) {
        this.list = list;
    }

    public LineLossStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(LineLossStatistics statistics) {
        this.statistics = statistics;
    }
}
