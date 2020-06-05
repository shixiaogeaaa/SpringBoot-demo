package com.repair.utils;

/*
* @auther SuperJJ
* json工具类
* 200：表示成功
* 500：表示错误，错误信息在msg字段中
* 501：bean验证错误，不管多少个错误都以map形式返回
* 502：拦截器拦截到用户token出错
* 555：异常抛出信息
* */
public class JsonResult {

    //响应状态码
    private Integer status;
    //响应消息
    private String msg;
    //响应数据
    private Object data;

    public JsonResult(){

    }

    public JsonResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public JsonResult(Integer status,String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static JsonResult ok() {
        return new JsonResult(null);
    }

    public static JsonResult ok(Object data) {
        return new JsonResult(data);
    }

    public static JsonResult errorMsg(String msg) {
        return new JsonResult(500,msg,null);
    }

    public static JsonResult errorMap(Object data) {
        return new JsonResult(501,"BeanError",data);
    }

    public static JsonResult errorTokenMsg(String msg) {
        return new JsonResult(502,msg,null);
    }

    public static JsonResult errorException(String msg) {
        return new JsonResult(555,msg,null);
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
}
