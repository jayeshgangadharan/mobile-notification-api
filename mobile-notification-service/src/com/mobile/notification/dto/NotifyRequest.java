package com.mobile.notification.dto;

import java.util.List;

/**
 * Notification Request Class
 * User: Jayesh
 * Date: 7/17/15
 * Time: 10:37 AM
 */
public class NotifyRequest {

    private String application;
    private String auth;
    private List<Notification> notifications;
    private NotificationServer notificationType;

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

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public NotificationServer getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationServer notificationType) {
        this.notificationType = notificationType;
    }
}
