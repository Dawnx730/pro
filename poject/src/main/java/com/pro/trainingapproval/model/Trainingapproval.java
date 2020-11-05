package com.pro.trainingapproval.model;

/**
 * 培训报批（培训管理模块）
 */
public class Trainingapproval {
    private Integer taid;

    private Integer userid;

    private String trf;

    private String fzr;

    private Integer trmark;

    private Integer deptid;

    private Integer tstatus;

    public Trainingapproval(Integer taid, Integer userid, String trf, String fzr, Integer trmark, Integer deptid, Integer tstatus) {
        this.taid = taid;
        this.userid = userid;
        this.trf = trf;
        this.fzr = fzr;
        this.trmark = trmark;
        this.deptid = deptid;
        this.tstatus = tstatus;
    }

    public Trainingapproval() {
        super();
    }

    public Integer getTaid() {
        return taid;
    }

    public void setTaid(Integer taid) {
        this.taid = taid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTrf() {
        return trf;
    }

    public void setTrf(String trf) {
        this.trf = trf;
    }

    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    public Integer getTrmark() {
        return trmark;
    }

    public void setTrmark(Integer trmark) {
        this.trmark = trmark;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getTstatus() {
        return tstatus;
    }

    public void setTstatus(Integer tstatus) {
        this.tstatus = tstatus;
    }
}