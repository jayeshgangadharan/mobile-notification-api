package com.mobile.notification;

import com.mobile.notification.dto.NotifyResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Notification controller class
 * User: gangadhj
 * Date: 7/17/15
 * Time: 8:28 AM
 */
@RestController
public class NotificationController {

    @RequestMapping(value = "/notify", produces = MediaType.APPLICATION_JSON_VALUE)
    public NotifyResponse greeting() {
        return new NotifyResponse("Hey GitHub!");
    }
}