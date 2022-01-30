package com.example.demo.dto;

/**
 * 统一封装返回结果
 * */
public class ResponseDto {

    //是否成功
    private Boolean success;
    //响应码
    private Integer code;
    //响应描述
    private String message;
    //响应数据
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
