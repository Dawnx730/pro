package com.pro.limit.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 树形菜单栏
 */
public class SysRight {
    private Integer rightCode;

    private Integer rightParentCode;

    private String rightType;

    private String rightText;

    private String rightUrl;

    private String rightTip;

    private Integer rightNodeType;

    private List<SysRight> children=new ArrayList<>();

    public List<SysRight> getChildren() {
        return children;
    }

    public void setChildren(List<SysRight> children) {
        this.children = children;
    }

    public SysRight(Integer rightCode, Integer rightParentCode, String rightType, String rightText, String rightUrl, String rightTip, Integer rightNodeType) {
        this.rightCode = rightCode;
        this.rightParentCode = rightParentCode;
        this.rightType = rightType;
        this.rightText = rightText;
        this.rightUrl = rightUrl;
        this.rightTip = rightTip;
        this.rightNodeType = rightNodeType;
    }

    public SysRight() {
        super();
    }

    public Integer getRightCode() {
        return rightCode;
    }

    @Override
    public String toString() {
        return "SysRight{" +
                "rightCode=" + rightCode +
                ", rightParentCode=" + rightParentCode +
                ", rightType='" + rightType + '\'' +
                ", rightText='" + rightText + '\'' +
                ", rightUrl='" + rightUrl + '\'' +
                ", rightTip='" + rightTip + '\'' +
                ", rightNodeType=" + rightNodeType +
                ", children=" + children +
                '}';
    }

    public void setRightCode(Integer rightCode) {
        this.rightCode = rightCode;
    }

    public Integer getRightParentCode() {
        return rightParentCode;
    }

    public void setRightParentCode(Integer rightParentCode) {
        this.rightParentCode = rightParentCode;
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl;
    }

    public String getRightTip() {
        return rightTip;
    }

    public void setRightTip(String rightTip) {
        this.rightTip = rightTip;
    }

    public Integer getRightNodeType() {
        return rightNodeType;
    }

    public void setRightNodeType(Integer rightNodeType) {
        this.rightNodeType = rightNodeType;
    }
}