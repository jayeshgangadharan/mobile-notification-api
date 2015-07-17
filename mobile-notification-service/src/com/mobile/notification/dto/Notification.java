package com.mobile.notification.dto;

/**
 * Notification content class
 * User: Jayesh
 * Date: 7/17/15
 * Time: 10:40 AM
 */
public class Notification {

    private String sendDate;

    private boolean ignoreUserTimezone;

    private String content;

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public boolean isIgnoreUserTimezone() {
        return ignoreUserTimezone;
    }

    public void setIgnoreUserTimezone(boolean ignoreUserTimezone) {
        this.ignoreUserTimezone = ignoreUserTimezone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
