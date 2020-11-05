package com.pro.trainingapproval.model;

public class Trainingfeedback {
    private Integer tfid;

    private Integer userid;

    private String username;

    private String trf;

    private String trfk;

    private Integer fstatus;

    public Trainingfeedback(Integer tfid, Integer userid, String username, String trf, String trfk, Integer fstatus) {
        this.tfid = tfid;
        this.userid = userid;
        this.username = username;
        this.trf = trf;
        this.trfk = trfk;
        this.fstatus = fstatus;
    }

    public Trainingfeedback() {
        super();
    }

    public Integer getTfid() {
        return tfid;
    }

    public void setTfid(Integer tfid) {
        this.tfid = tfid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTrf() {
        return trf;
    }

    public void setTrf(String trf) {
        this.trf = trf;
    }

    public String getTrfk() {
        return trfk;
    }

    public void setTrfk(String trfk) {
        this.trfk = trfk;
    }

    public Integer getFstatus() {
        return fstatus;
    }

    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }
}