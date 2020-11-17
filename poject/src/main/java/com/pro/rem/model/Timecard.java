package com.pro.rem.model;

public class Timecard {
    private Integer id;

    private Integer fid;

    private Integer work;

    private Integer ywork;

    private Integer month;

    private Integer tyear;

    private String tremark;

    private Integer late;

    private Integer leave;

    private Integer overtime;

    public Timecard(Integer id, Integer fid, Integer work, Integer ywork, Integer month, Integer tyear, String tremark, Integer late, Integer leave, Integer overtime) {
        this.id = id;
        this.fid = fid;
        this.work = work;
        this.ywork = ywork;
        this.month = month;
        this.tyear = tyear;
        this.tremark = tremark;
        this.late = late;
        this.leave = leave;
        this.overtime = overtime;
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

    public Integer getWork() {
        return work;
    }

    public void setWork(Integer work) {
        this.work = work;
    }

    public Integer getYwork() {
        return ywork;
    }

    public void setYwork(Integer ywork) {
        this.ywork = ywork;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getTyear() {
        return tyear;
    }

    public void setTyear(Integer tyear) {
        this.tyear = tyear;
    }

    public String getTremark() {
        return tremark;
    }

    public void setTremark(String tremark) {
        this.tremark = tremark;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getLeave() {
        return leave;
    }

    public void setLeave(Integer leave) {
        this.leave = leave;
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }
}