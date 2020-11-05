package com.pro.contract.model;

/**
 * 合同管理
 */
public class Contract {
    private Integer id;

    private Integer fid;//员工id

    private String cname;//合同名称

    private String cnature;//合同性质

    private String cagreement;//合同达成内容

    private Integer cstatus;//合同状态，例如1、正在使用 2、弃用

    public Contract(Integer id, Integer fid, String cname, String cnature, String cagreement, Integer cstatus) {
        this.id = id;
        this.fid = fid;
        this.cname = cname;
        this.cnature = cnature;
        this.cagreement = cagreement;
        this.cstatus = cstatus;
    }

    public Contract() {
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