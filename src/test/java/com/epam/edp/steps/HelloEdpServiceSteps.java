package com.epam.edp.steps;

import com.epam.edp.service.api.HelloEdpApi;
import com.epam.edp.service.impl.HelloEdpApiImpl;
import com.jayway.restassured.specification.RequestSpecification;

/**
 * @author Roman_Martseniuk
 */
public class HelloEdpServiceSteps {

    private HelloEdpApi helloEdpApi;

    public HelloEdpServiceSteps(RequestSpecification requestSpecification) {
        this.helloEdpApi = new HelloEdpApiImpl(requestSpecification);
    }

    public void shouldGetHelloWorld() {
        helloEdpApi.getStringWithHelloWorld();
    }

    public void shouldGetStringStartWithWordHello() {
        helloEdpApi.getStringWhichStartWithHello();
    }

    public void shouldGetStringWhichNotNull() {
        helloEdpApi.getStringWhichNotNull();
    }

    public void shouldGetStriEndsWithExclamationMark() {
        helloEdpApi.getStringWhichEndWithExclamationMark();
    }
}