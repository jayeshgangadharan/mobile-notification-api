package com.mobile.notification.dto;

/**
 * User: Jayesh
 * Date: 7/17/15
 * Time: 10:16 AM
 */
public class NotifyResponse {

    public NotifyResponse() {
    }

    public NotifyResponse(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
