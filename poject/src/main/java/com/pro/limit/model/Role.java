package com.pro.limit.model;

public class Role {
    private Integer id;

    private Integer sysid;

    private Integer userid;

    public Role(Integer id, Integer sysid, Integer userid) {
        this.id = id;
        this.sysid = sysid;
        this.userid = userid;
    }

    public Role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSysid() {
        return sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}