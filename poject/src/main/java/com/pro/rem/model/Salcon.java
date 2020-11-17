package com.pro.rem.model;

public class Salcon {
    private Integer id;

    private Integer userid;

    private Float wage;

    private Float housefund;

    private Float reimbursement;

    private Float paward;

    private Float insur;

    private Integer sastatus;

    public Salcon(Integer id, Integer userid, Float wage, Float housefund, Float reimbursement, Float paward, Float insur, Integer sastatus) {
        this.id = id;
        this.userid = userid;
        this.wage = wage;
        this.housefund = housefund;
        this.reimbursement = reimbursement;
        this.paward = paward;
        this.insur = insur;
        this.sastatus = sastatus;
    }

    public Salcon() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Float getWage() {
        return wage;
    }

    public void setWage(Float wage) {
        this.wage = wage;
    }

    public Float getHousefund() {
        return housefund;
    }

    public void setHousefund(Float housefund) {
        this.housefund = housefund;
    }

    public Float getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(Float reimbursement) {
        this.reimbursement = reimbursement;
    }

    public Float getPaward() {
        return paward;
    }

    public void setPaward(Float paward) {
        this.paward = paward;
    }

    public Float getInsur() {
        return insur;
    }

    public void setInsur(Float insur) {
        this.insur = insur;
    }

    public Integer getSastatus() {
        return sastatus;
    }

    public void setSastatus(Integer sastatus) {
        this.sastatus = sastatus;
    }
}