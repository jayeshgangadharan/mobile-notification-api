package com.mobile.notification.dto;

/**
 * User: Jayesh
 * Date: 7/17/15
 * Time: 10:16 AM
 */
public class NotifyResponse {

    private String statusCode;
    private String statusMessage;


    public NotifyResponse() {
    }

    public NotifyResponse(String message) {
        this.statusMessage = message;
    }


    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
