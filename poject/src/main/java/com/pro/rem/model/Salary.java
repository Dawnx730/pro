package com.pro.rem.model;

public class Salary {
    private Integer userid;

    private Float bwage;

    private Float housefund;

    private Float reimbursement;

    private Float paward;

    private Integer sastatus;

    private Float overtime;

    private Float insur;

    public Salary(Integer userid, Float bwage, Float housefund, Float reimbursement, Float paward, Integer sastatus, Float overtime, Float insur) {
        this.userid = userid;
        this.bwage = bwage;
        this.housefund = housefund;
        this.reimbursement = reimbursement;
        this.paward = paward;
        this.sastatus = sastatus;
        this.overtime = overtime;
        this.insur = insur;
    }

    public Salary() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Float getBwage() {
        return bwage;
    }

    public void setBwage(Float bwage) {
        this.bwage = bwage;
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

    public Integer getSastatus() {
        return sastatus;
    }

    public void setSastatus(Integer sastatus) {
        this.sastatus = sastatus;
    }

    public Float getOvertime() {
        return overtime;
    }

    public void setOvertime(Float overtime) {
        this.overtime = overtime;
    }

    public Float getInsur() {
        return insur;
    }

    public void setInsur(Float insur) {
        this.insur = insur;
    }
}