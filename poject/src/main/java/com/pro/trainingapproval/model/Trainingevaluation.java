package com.pro.trainingapproval.model;

public class Trainingevaluation {
    private Integer teid;

    private Integer userid;

    private String fzr;

    private String trf;

    private String tre;

    private Integer tstatus;

    public Trainingevaluation(Integer teid, Integer userid, String fzr, String trf, String tre, Integer tstatus) {
        this.teid = teid;
        this.userid = userid;
        this.fzr = fzr;
        this.trf = trf;
        this.tre = tre;
        this.tstatus = tstatus;
    }

    public Trainingevaluation() {
        super();
    }

    public Integer getTeid() {
        return teid;
    }

    public void setTeid(Integer teid) {
        this.teid = teid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    public String getTrf() {
        return trf;
    }

    public void setTrf(String trf) {
        this.trf = trf;
    }

    public String getTre() {
        return tre;
    }

    public void setTre(String tre) {
        this.tre = tre;
    }

    public Integer getTstatus() {
        return tstatus;
    }

    public void setTstatus(Integer tstatus) {
        this.tstatus = tstatus;
    }
}