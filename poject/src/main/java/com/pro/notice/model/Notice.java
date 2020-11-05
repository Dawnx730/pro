package com.pro.notice.model;
/**
 * 系统公告管理（系统公告管理模块）
 */
public class Notice {
    private Integer nid;

    private String nname;

    private String abst;

    private String ncontent;

    private String ntime;

    private Integer nstatus;

    public Notice(Integer nid, String nname, String abst, String ncontent, String ntime, Integer nstatus) {
        this.nid = nid;
        this.nname = nname;
        this.abst = abst;
        this.ncontent = ncontent;
        this.ntime = ntime;
        this.nstatus = nstatus;
    }

    public Notice() {
        super();
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getAbst() {
        return abst;
    }

    public void setAbst(String abst) {
        this.abst = abst;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public String getNtime() {
        return ntime;
    }

    public void setNtime(String ntime) {
        this.ntime = ntime;
    }

    public Integer getNstatus() {
        return nstatus;
    }

    public void setNstatus(Integer nstatus) {
        this.nstatus = nstatus;
    }
}