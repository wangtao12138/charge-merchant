package cn.com.cdboost.charge.merchant.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "cp_b_admindivision")
public class Admindivision implements Serializable {
    /**
     * 行政区划编号
     */
    @Id
    @Column(name = "ad_no")
    private Integer adNo;

    /**
     * 行政区划名
     */
    @Column(name = "ad_name")
    private String adName;

    /**
     * 父级行政区划编号
     */
    @Column(name = "p_ad_no")
    private Integer pAdNo;

    /**
     * 行政区划级别（1-省，2-市，3-区）
     */
    @Column(name = "ad_level")
    private Integer adLevel;

    /**
     * 行政区划归属
     */
    @Column(name = "ad_path")
    private String adPath;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取行政区划编号
     *
     * @return ad_no - 行政区划编号
     */
    public Integer getAdNo() {
        return adNo;
    }

    /**
     * 设置行政区划编号
     *
     * @param adNo 行政区划编号
     */
    public void setAdNo(Integer adNo) {
        this.adNo = adNo;
    }

    /**
     * 获取行政区划名
     *
     * @return ad_name - 行政区划名
     */
    public String getAdName() {
        return adName;
    }

    /**
     * 设置行政区划名
     *
     * @param adName 行政区划名
     */
    public void setAdName(String adName) {
        this.adName = adName;
    }

    /**
     * 获取父级行政区划编号
     *
     * @return p_ad_no - 父级行政区划编号
     */
    public Integer getpAdNo() {
        return pAdNo;
    }

    /**
     * 设置父级行政区划编号
     *
     * @param pAdNo 父级行政区划编号
     */
    public void setpAdNo(Integer pAdNo) {
        this.pAdNo = pAdNo;
    }

    /**
     * 获取行政区划级别（1-省，2-市，3-区）
     *
     * @return ad_level - 行政区划级别（1-省，2-市，3-区）
     */
    public Integer getAdLevel() {
        return adLevel;
    }

    /**
     * 设置行政区划级别（1-省，2-市，3-区）
     *
     * @param adLevel 行政区划级别（1-省，2-市，3-区）
     */
    public void setAdLevel(Integer adLevel) {
        this.adLevel = adLevel;
    }

    /**
     * 获取行政区划归属
     *
     * @return ad_path - 行政区划归属
     */
    public String getAdPath() {
        return adPath;
    }

    /**
     * 设置行政区划归属
     *
     * @param adPath 行政区划归属
     */
    public void setAdPath(String adPath) {
        this.adPath = adPath;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}