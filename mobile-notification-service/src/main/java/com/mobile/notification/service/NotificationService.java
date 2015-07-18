package com.mobile.notification.service;

import com.mobile.notification.dto.Notification;
import com.mobile.notification.dto.NotifyResponse;

/**
 * User: Jayesh
 * Date: 7/17/15
 * Time: 12:57 PM
 */
public interface NotificationService {

    public NotifyResponse sendNotification(Notification notification);
}
