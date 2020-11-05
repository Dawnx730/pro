package com.pro.limit.model;

public class Userinfo {
    private Integer fid;

    private String fname;

    private Integer deptid;

    private String position;

    private Integer ftel;

    private String fsex;

    private String birth;

    private String edu;

    private String native;

    private Integer fstatus;

    public Userinfo(Integer fid, String fname, Integer deptid, String position, Integer ftel, String fsex, String birth, String edu, String native, Integer fstatus) {
        this.fid = fid;
        this.fname = fname;
        this.deptid = deptid;
        this.position = position;
        this.ftel = ftel;
        this.fsex = fsex;
        this.birth = birth;
        this.edu = edu;
        this.native = native;
        this.fstatus = fstatus;
    }

    public Userinfo() {
        super();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getFtel() {
        return ftel;
    }

    public void setFtel(Integer ftel) {
        this.ftel = ftel;
    }

    public String getFsex() {
        return fsex;
    }

    public void setFsex(String fsex) {
        this.fsex = fsex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getNative() {
        return native;
    }

    public void setNative(String native) {
        this.native = native;
    }

    public Integer getFstatus() {
        return fstatus;
    }

    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }
}