package com.cagataygurturk.springbootboilerplate.controllers;

import com.cagataygurturk.springbootboilerplate.SpringBootBoilerplateApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootBoilerplateApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port=12345")
public class PingControllerTest {

    protected static String BASE_URL = "http://localhost:12345";

    @Test
    public void getPing() throws Exception {
        get(BASE_URL + "/ping")
                .then()
                .statusCode(200)
                .assertThat()
                .body("id", equalTo(1))
                .body("name", equalTo("John Doe"));
    }

}