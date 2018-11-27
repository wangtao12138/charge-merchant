package cn.com.cdboost.charge.merchant.vo.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 智慧应用，用户选择项目的树形结构
 */
@Getter
@Setter
public class ProjectTreeInfo implements TreeEntityProject<ProjectTreeInfo> {
    /**
     * 节点类型 1标识组织，2标识项目
     */
    private Integer nodeType;

    /**
     * 节点编号
     * nodeType=1时，表示组织编号
     * nodeType=2时，表示项目projectGuid
     */
    private String nodeId;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 上级节点编号
     */
    private String pNodeNo;

    /**
     * 对应节点下拥有的项目数,默认设置为0
     */
    private Long projectHolds = 0L;
    /**
     * 是否有孩子节点
     */
    private Boolean hasChild=false ;
    /**
     * 是否展开
     */
    private Boolean open=false;

    /**
     * 该节点的孩子节点
     */
    @JSONField(serialize = false)
    private Integer level;


    private List<ProjectTreeInfo> children;


    @Override
    @JSONField(serialize=false)
    public String getId() {
        return nodeId;
    }

    @Override
    @JSONField(serialize=false)
    public String getParentId() {
        return pNodeNo;
    }

    @Override
    public Integer getLevel() {
        return level;
    }


    @Override
    public void setChildList(List<ProjectTreeInfo> childList) {
        this.children = childList;
    }

    @Override
    public void setTotal(Long num) {
        this.projectHolds = num;
    }

    @Override
    @JSONField(serialize=false)
    public Long getTotal() {
        return projectHolds;
    }

    @Override
    public void setHashChild(Boolean hashChild) {
        this.hasChild=hashChild;
    }


}
