package com.pro.limit.model;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private Integer level;

    private Integer status;

    private Integer fid;

    public User(Integer userid, String username, String password, Integer level, Integer status, Integer fid) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.level = level;
        this.status = status;
        this.fid = fid;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", level=" + level +
                ", status=" + status +
                ", fid=" + fid +
                '}';
    }
}