package com.mobile.notification.service;

import com.mobile.notification.dto.Notification;
import com.mobile.notification.dto.NotifyResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Pushwoosh notification service
 * User: Jayesh
 * Date: 7/17/15
 * Time: 12:55 PM
 */
@Component
public class PushwooshNotificationService implements NotificationService {

    @Resource
    private RestTemplate restTemplate;

    @Value("${pushwoosh.url:https://cp.pushwoosh.com/json/1.3/}")
    private String pushwooshUrl;

    @Value("${pushwoosh.application.code:TestApp}")
    private String pushwooshApplicationCode;

    @Value("${pushwoosh.api.access.token:Testtoken}")
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
