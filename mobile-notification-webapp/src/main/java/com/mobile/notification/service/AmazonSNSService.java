package com.mobile.notification.service;

import com.mobile.notification.dto.Notification;
import com.mobile.notification.dto.NotifyResponse;

/**
 * User: Jayesh
 * Date: 7/17/15
 * Time: 12:57 PM
 */
public class AmazonSNSService implements NotificationService {

    @Override
    public NotifyResponse sendNotification(Notification notification) {
        throw new UnsupportedOperationException("Amazon SNS is not integreted.");
    }

}
