package com.mobile.notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * User: Jayesh
 * Date: 7/17/15
 * Time: 12:54 PM
 */
@Configuration
@ComponentScan("com.mobile.notification.service")
public class ApplicationConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
