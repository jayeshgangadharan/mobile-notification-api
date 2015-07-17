package com.mobile.notification.service;

import com.mobile.notification.dto.Notification;
import com.mobile.notification.dto.NotifyResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Pushwoosh notification service
 * User: Jayesh
 * Date: 7/17/15
 * Time: 12:55 PM
 */
@Component
public class PushwooshNotificationService implements NotificationService {

    private RestTemplate restTemplate = new RestTemplate();

    @Value("${pushwoosh.url:https://cp.pushwoosh.com/json/1.3/}")
    private String pushwooshUrl;

    @Value("${pusswoosh.application.code}")
    private String pushwooshApplicationCode;

    @Value("${pusswoosh.api.access.token}")
    private String pushwooshAccessCode;

    @Override
    public NotifyResponse sendNotification(Notification notification) {
        NotifyResponse response = new NotifyResponse();
        String url = getCreateMessageUrl();
        response = restTemplate.getForObject(url, NotifyResponse.class);
        return response;
    }

    public String getCreateMessageUrl() {
        return pushwooshUrl +"/createMessage";
    }
}
