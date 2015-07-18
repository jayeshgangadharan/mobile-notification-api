package com.mobile.notification.service;


import com.mobile.notification.dto.Notification;
import com.mobile.notification.dto.NotifyResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Test class for PushwooshNotification
 * User: Jayesh
 * Date: 7/17/15
 * Time: 9:44 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PushwooshNotificationServiceTest.Config.class)
public class PushwooshNotificationServiceTest {

    @Resource
    private NotificationService pushwooshNotificationService;

    @Resource
    private RestTemplate restTemplate;

    @Before
    public void setUp() throws Exception {
        NotifyResponse notifyResponse = new NotifyResponse();
        notifyResponse.setMessage("TEST");
        when(restTemplate.getForObject(anyString(), eq(NotifyResponse.class))).thenReturn(notifyResponse);
    }

    @Test
    public void testSendNotification() throws Exception {
        Notification notification = new Notification();
        NotifyResponse notifyResponse = pushwooshNotificationService.sendNotification(notification);
        assertEquals("TEST", notifyResponse.getMessage());
    }

    @Configuration
    @ComponentScan("com.mobile.notification.service")
    public static class Config {

        @Bean
        public static PropertyPlaceholderConfigurer propertiesResolver() {
            return new PropertyPlaceholderConfigurer();
        }

        @Bean
        public RestTemplate restTemplate() {
            return mock(RestTemplate.class);
        }
    }
}
