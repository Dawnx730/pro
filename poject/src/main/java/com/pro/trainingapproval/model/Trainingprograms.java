package com.pro.trainingapproval.model;

public class Trainingprograms {
    private Integer tpid;

    private String trp;

    private String trinfo;

    private Integer trm;

    private Integer trid;

    private Integer status;

    public Trainingprograms(Integer tpid, String trp, String trinfo, Integer trm, Integer trid, Integer status) {
        this.tpid = tpid;
        this.trp = trp;
        this.trinfo = trinfo;
        this.trm = trm;
        this.trid = trid;
        this.status = status;
    }

    public Trainingprograms() {
        super();
    }

    public Integer getTpid() {
        return tpid;
    }

    public void setTpid(Integer tpid) {
        this.tpid = tpid;
    }

    public String getTrp() {
        return trp;
    }

    public void setTrp(String trp) {
        this.trp = trp;
    }

    public String getTrinfo() {
        return trinfo;
    }

    public void setTrinfo(String trinfo) {
        this.trinfo = trinfo;
    }

    public Integer getTrm() {
        return trm;
    }

    public void setTrm(Integer trm) {
        this.trm = trm;
    }

    public Integer getTrid() {
        return trid;
    }

    public void setTrid(Integer trid) {
        this.trid = trid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}