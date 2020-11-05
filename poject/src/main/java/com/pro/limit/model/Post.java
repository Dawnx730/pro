package com.pro.limit.model;

/**
 * 职位表
 */
public class Post {
    private Integer postid;

    private String postname;

    public Post(Integer postid, String postname) {
        this.postid = postid;
        this.postname = postname;
    }

    public Post() {
        super();
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }
}