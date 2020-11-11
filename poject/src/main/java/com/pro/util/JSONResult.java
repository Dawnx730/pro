package com.pro.util;


import java.util.List;

public class JSONResult {

    // 响应业务状态
    private Integer status;
    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    // 分页中的total 总页数
    private Integer total;


    private String ok; // 不使用

    public static JSONResult build(Integer status, String msg, Object data) {
        return new JSONResult(status, msg, data);
    }

//    public static JSONResult build(Integer status, String msg, List<WardVo> wardVos, Object data) {
//        return new JSONResult(status,msg, data);
//    }

    public static JSONResult build(Integer status, String msg, Object data, int total) {
        return new JSONResult(status,msg, data);
    }

    public JSONResult(Integer status, String msg, Object data, int total, String ok) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.total = total;
        this.ok = ok;
    }


    public static JSONResult ok(Object data) {
        return new JSONResult(data);
    }

    public static JSONResult ok(Object data,Integer total) {
        return new JSONResult(data,total);
    }

    public static JSONResult ok() {
        return new JSONResult(null);
    }

    public static JSONResult errorMsg(String msg) {
        return new JSONResult(500, msg, null);
    }

    public static JSONResult errorMap(Object data) {
        return new JSONResult(501, "error", data);
    }

    public static JSONResult errorTokenMsg(String msg) {
        return new JSONResult(502, msg, null);
    }

    public static JSONResult errorException(String msg) {
        return new JSONResult(555, msg, null);
    }



    public JSONResult(Object data, Integer total) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
        this.total = total;
    }

    public JSONResult() {

    }
    public JSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }


    public JSONResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}