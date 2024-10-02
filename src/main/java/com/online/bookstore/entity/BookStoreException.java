package com.online.bookstore.entity;

import java.io.IOException;

import com.online.bookstore.constant.ResponseCode;



public class BookStoreException extends IOException {

    private String errorCode;
    private String errorMessage;
    private int statusCode;

    public BookStoreException(String errorMessage) {
        super(errorMessage);
        this.errorCode = "BAD_REQUEST";
        this.setStatusCode(400);
        this.errorMessage = errorMessage;
    }

    public BookStoreException(ResponseCode errorCodes) {
        super(errorCodes.getMessage());
        this.statusCode = errorCodes.getCode();
        this.errorMessage = errorCodes.getMessage();
        this.setErrorCode(errorCodes.name());
    }

    public BookStoreException(String errroCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errroCode;
        this.errorMessage = errorMessage;
        this.statusCode = 422;
    }

    public BookStoreException(int statusCode, String errorCode, String errorMessage) {
        super(errorMessage);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

}
