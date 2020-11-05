package com.pro.trainingapproval.model;

public class Trainingplan {
    private Integer trid;

    private String trf;

    private String trd;

    private String trn;

    private String trst;

    private String trc;

    private Integer pstatus;

    public Trainingplan(Integer trid, String trf, String trd, String trn, String trst, String trc, Integer pstatus) {
        this.trid = trid;
        this.trf = trf;
        this.trd = trd;
        this.trn = trn;
        this.trst = trst;
        this.trc = trc;
        this.pstatus = pstatus;
    }

    public Trainingplan() {
        super();
    }

    public Integer getTrid() {
        return trid;
    }

    public void setTrid(Integer trid) {
        this.trid = trid;
    }

    public String getTrf() {
        return trf;
    }

    public void setTrf(String trf) {
        this.trf = trf;
    }

    public String getTrd() {
        return trd;
    }

    public void setTrd(String trd) {
        this.trd = trd;
    }

    public String getTrn() {
        return trn;
    }

    public void setTrn(String trn) {
        this.trn = trn;
    }

    public String getTrst() {
        return trst;
    }

    public void setTrst(String trst) {
        this.trst = trst;
    }

    public String getTrc() {
        return trc;
    }

    public void setTrc(String trc) {
        this.trc = trc;
    }

    public Integer getPstatus() {
        return pstatus;
    }

    public void setPstatus(Integer pstatus) {
        this.pstatus = pstatus;
    }
}