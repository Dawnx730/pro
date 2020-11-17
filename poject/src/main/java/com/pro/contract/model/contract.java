package com.pro.contract.model;

public class contract {
    private Integer id;

    private Integer fid;

    private String cname;

    private String cnature;

    private String cagreement;

    private Integer cstatus;

    public contract(Integer id, Integer fid, String cname, String cnature, String cagreement, Integer cstatus) {
        this.id = id;
        this.fid = fid;
        this.cname = cname;
        this.cnature = cnature;
        this.cagreement = cagreement;
        this.cstatus = cstatus;
    }

    public contract() {
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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCnature() {
        return cnature;
    }

    public void setCnature(String cnature) {
        this.cnature = cnature;
    }

    public String getCagreement() {
        return cagreement;
    }

    public void setCagreement(String cagreement) {
        this.cagreement = cagreement;
    }

    public Integer getCstatus() {
        return cstatus;
    }

    public void setCstatus(Integer cstatus) {
        this.cstatus = cstatus;
    }
}