package com.pro.rem.model;

public class Salary {
    private Integer userid;

    private Float bwage;

    private Float housefund;

    private Float reimbursement;

    private Float paward;

    private Float overtime;

    private Float insur;

    private Integer sastatus;

    private Integer smonth;

    private Integer syear;

    public Salary(Integer userid, Float bwage, Float housefund, Float reimbursement, Float paward, Float overtime, Float insur, Integer sastatus, Integer smonth, Integer syear) {
        this.userid = userid;
        this.bwage = bwage;
        this.housefund = housefund;
        this.reimbursement = reimbursement;
        this.paward = paward;
        this.overtime = overtime;
        this.insur = insur;
        this.sastatus = sastatus;
        this.smonth = smonth;
        this.syear = syear;
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

    public Integer getSastatus() {
        return sastatus;
    }

    public void setSastatus(Integer sastatus) {
        this.sastatus = sastatus;
    }

    public Integer getSmonth() {
        return smonth;
    }

    public void setSmonth(Integer smonth) {
        this.smonth = smonth;
    }

    public Integer getSyear() {
        return syear;
    }

    public void setSyear(Integer syear) {
        this.syear = syear;
    }
}