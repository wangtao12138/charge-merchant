package cn.com.cdboost.charge.merchant.dto.param;

import lombok.Getter;
import lombok.Setter;

/**
 * 分页查询vo
 */
@Setter
@Getter
public class PageQueryVo {


    private Integer pageIndex;

    private Integer pageEndIndex;
    /**
     * 每页显示数量
     */
    private Integer pageSize;

    /**
     * 页号
     */
    private Integer pageNumber;

    private Integer pageEndNum;

    /**
     * 分页查询满足条件的总数量
     */
    private Long total;
    /**
     * 分页查询满足条件的总数量,这个和total的含义一样，主要是存储过程返回有时候是total，有时候是rowCount
     */
    private Long rowCount;

    /**
     *  排序字段
     */
    private String sortName;

    /**
     * asc或desc
     */
    private String sortOrder;


}
