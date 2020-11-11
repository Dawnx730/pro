package com.pro.limit.model;

public class User {
    private Integer userid;

    private String account;

    private String password;

    private Integer level;

    private Integer status;

    private Integer fid;

    private String username;

    public User(Integer userid, String account, String password, Integer level, Integer status, Integer fid, String username) {
        this.userid = userid;
        this.account = account;
        this.password = password;
        this.level = level;
        this.status = status;
        this.fid = fid;
        this.username = username;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}