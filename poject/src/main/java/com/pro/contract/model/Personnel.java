package com.pro.contract.model;

/**
 * 人事变动管理（人事档案管理模块）
 */
public class Personnel {
    private Integer pid;

    private Integer fid;

    private String detail;

    private String reason;

    public Personnel(Integer pid, Integer fid, String detail, String reason) {
        this.pid = pid;
        this.fid = fid;
        this.detail = detail;
        this.reason = reason;
    }

    public Personnel() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}