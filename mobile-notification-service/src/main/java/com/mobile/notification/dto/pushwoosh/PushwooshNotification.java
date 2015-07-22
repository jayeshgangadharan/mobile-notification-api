package com.mobile.notification.dto.pushwoosh;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * User: Jayesh
 * Date: 7/21/15
 * Time: 8:32 PM
 */
@JsonPropertyOrder({
        "send_date",
        "ignore_user_timezone",
        "content"
})

public class PushwooshNotification {


    @JsonProperty("send_date")
    private String sendDate;
    @JsonProperty("ignore_user_timezone")
    private Boolean ignoreUserTimezone;
    @JsonProperty("content")
    private String content;


    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public Boolean getIgnoreUserTimezone() {
        return ignoreUserTimezone;
    }

    public void setIgnoreUserTimezone(Boolean ignoreUserTimezone) {
        this.ignoreUserTimezone = ignoreUserTimezone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
