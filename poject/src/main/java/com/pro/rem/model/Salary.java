package com.pro.rem.model;

public class Salary {
    private Integer userid;

    private Integer bwage;

    private Integer housefund;

    private Integer pension;

    private Integer health;

    private Integer unemployment;

    private Integer reimbursement;

    private Integer paward;

    public Salary(Integer userid, Integer bwage, Integer housefund, Integer pension, Integer health, Integer unemployment, Integer reimbursement, Integer paward) {
        this.userid = userid;
        this.bwage = bwage;
        this.housefund = housefund;
        this.pension = pension;
        this.health = health;
        this.unemployment = unemployment;
        this.reimbursement = reimbursement;
        this.paward = paward;
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

    public Integer getBwage() {
        return bwage;
    }

    public void setBwage(Integer bwage) {
        this.bwage = bwage;
    }

    public Integer getHousefund() {
        return housefund;
    }

    public void setHousefund(Integer housefund) {
        this.housefund = housefund;
    }

    public Integer getPension() {
        return pension;
    }

    public void setPension(Integer pension) {
        this.pension = pension;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getUnemployment() {
        return unemployment;
    }

    public void setUnemployment(Integer unemployment) {
        this.unemployment = unemployment;
    }

    public Integer getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(Integer reimbursement) {
        this.reimbursement = reimbursement;
    }

    public Integer getPaward() {
        return paward;
    }

    public void setPaward(Integer paward) {
        this.paward = paward;
    }
}