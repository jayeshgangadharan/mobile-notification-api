package com.mobile.notification;

import com.jayway.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


/**
 * User: Jayesh
 * Date: 7/17/15
 * Time: 8:44 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest("server.port:0")
public class NotificationControllerTest {

    @Value("${local.server.port}")
    int port;

    @Before
    public void setup() {
        RestAssured.port = port;
    }

    @Test
    public void testNotifyMessage() {
        when().get("/notify").then()
                .statusCode(HttpStatus.SC_OK)
                .body("message", equalTo("Hey GitHub!"));
        ;
    }
}
