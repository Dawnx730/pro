package com.pro.rem.model;

public class Timecard {
    private Integer id;

    private Integer fid;

    private String work;

    private String ywork;

    private String month;

    private String tyear;

    private String tremark;

    public Timecard(Integer id, Integer fid, String work, String ywork, String month, String tyear, String tremark) {
        this.id = id;
        this.fid = fid;
        this.work = work;
        this.ywork = ywork;
        this.month = month;
        this.tyear = tyear;
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

    public String getYwork() {
        return ywork;
    }

    public void setYwork(String ywork) {
        this.ywork = ywork;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTyear() {
        return tyear;
    }

    public void setTyear(String tyear) {
        this.tyear = tyear;
    }

    public String getTremark() {
        return tremark;
    }

    public void setTremark(String tremark) {
        this.tremark = tremark;
    }
}