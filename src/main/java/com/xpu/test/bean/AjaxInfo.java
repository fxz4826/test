package com.xpu.test.bean;

public class AjaxInfo<T> {

    private int code;    //请求成功的响应码，0表示请求成功，-1表示失败，-2表示权限不足
    private String msg;  //给页面响应的字符串信息
    private T data;      //给页面响应的具体数据

    public AjaxInfo() {
    }

    public AjaxInfo(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
