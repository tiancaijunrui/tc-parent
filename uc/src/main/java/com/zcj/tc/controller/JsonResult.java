package com.zcj.tc.controller;


public class JsonResult {
    /**
     * 状态
     */
    private JsonStatus status = JsonStatus.SUCCESS;
    /**
     * 消息
     */
    private String message;
    /**
     * 返回的数据
     */
    private Object data;

    private Object body;

    private boolean success;

    private int code;

    public JsonStatus getStatus() {
        return status;
    }

    public void setStatus(JsonStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}