package com.pro.limit.model;

/**
 *部门（权限模块）
 */
public class Dept {
    private Integer deptid;

    private String deptname;

    private String dremark;

    public Dept(Integer deptid, String deptname, String dremark) {
        this.deptid = deptid;
        this.deptname = deptname;
        this.dremark = dremark;
    }

    public Dept() {
        super();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDremark() {
        return dremark;
    }

    public void setDremark(String dremark) {
        this.dremark = dremark;
    }
}