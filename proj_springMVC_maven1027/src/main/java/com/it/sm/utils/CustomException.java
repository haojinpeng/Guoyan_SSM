package com.it.sm.utils;
//用户自定义异常
public class CustomException extends Exception{
    private String message;

    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
