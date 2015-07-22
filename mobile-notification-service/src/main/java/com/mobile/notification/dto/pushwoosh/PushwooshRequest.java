package com.mobile.notification.dto.pushwoosh;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

/**
 * User: Jayesh
 * Date: 7/21/15
 * Time: 9:48 PM
 */
@JsonPropertyOrder({
        "application",
        "auth",
        "notifications"
})
public class PushwooshRequest {

    @JsonProperty("application")
    private String application;
    @JsonProperty("auth")
    private String auth;
    @JsonProperty("notifications")
    private List<PushwooshNotification> pushwooshNotifications;

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public List<PushwooshNotification> getPushwooshNotifications() {
        return pushwooshNotifications;
    }

    public void setPushwooshNotifications(List<PushwooshNotification> pushwooshNotifications) {
        this.pushwooshNotifications = pushwooshNotifications;
    }
}
