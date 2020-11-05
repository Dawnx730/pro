package com.pro.rem.model;

/**
 * 打卡表
 */
public class Timecard {
    private Integer id;

    private Integer fid;

    private String work;

    private String duty;

    private String month;

    private String tremark;

    public Timecard(Integer id, Integer fid, String work, String duty, String month, String tremark) {
        this.id = id;
        this.fid = fid;
        this.work = work;
        this.duty = duty;
        this.month = month;
        this.tremark = tremark;
    }

    public Timecard() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTremark() {
        return tremark;
    }

    public void setTremark(String tremark) {
        this.tremark = tremark;
    }
}