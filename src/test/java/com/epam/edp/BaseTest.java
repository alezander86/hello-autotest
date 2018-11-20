package com.epam.edp;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.filter.log.RequestLoggingFilter;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;
import com.jayway.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author Roman_Martseniuk
 */
public class BaseTest {

    protected static RequestSpecification requestSpecification;

    @BeforeClass
    public static void configureRestAssured() {
        RestAssured.useRelaxedHTTPSValidation();
        requestSpecification = new RequestSpecBuilder()
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter()).build();
    }

    @AfterClass
    public static void unconfigureRestAssured() {
        RestAssured.reset();
    }
}