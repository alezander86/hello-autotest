package com.epam.edp.service.impl;

import com.epam.edp.service.api.HelloEdpApi;
import com.epam.edp.util.HelloEdpApiUrl;
import com.epam.edp.util.PropertyReader;
import com.jayway.restassured.specification.RequestSpecification;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.startsWith;

/**
 * @author Roman_Martseniuk
 */
public class HelloEdpApiImpl implements HelloEdpApi {

    private RequestSpecification requestSpecification;
    private String basePath;

    public HelloEdpApiImpl(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
        this.basePath = PropertyReader.getProperty("host.name");
    }

    public void getStringWithHelloWorld() {
        given().spec(requestSpecification)
                .request()
                    .get(basePath.concat(HelloEdpApiUrl.GET_SETTING))
                .then()
                    .assertThat().statusCode(200)
                .and()
                    .body(is("Hello World!"));
    }

    public void getStringWhichContainHello() {
        given().spec(requestSpecification)
                .request()
                    .get(basePath.concat(HelloEdpApiUrl.GET_SETTING))
                .then()
                    .assertThat().statusCode(200)
                .and()
                    .body(startsWith("Hello"));
    }

    public void getStringWhichContainTwoWords() {
        given().spec(requestSpecification)
                .request()
                    .get(basePath.concat(HelloEdpApiUrl.GET_SETTING))
                .then()
                    .assertThat().statusCode(200)
                .and()
                    .body(notNullValue());
    }
}