package com.epam.edp;

import com.epam.edp.steps.HelloEdpServiceSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Roman_Martseniuk
 */
public class HelloEdpTest extends BaseTest {

    private HelloEdpServiceSteps helloEdpServiceSteps;

    @BeforeMethod
    public void init() {
        helloEdpServiceSteps = new HelloEdpServiceSteps(requestSpecification);
    }

    @Test
    public void testGetStringWithHelloWorld() {
        helloEdpServiceSteps.shouldGetHelloWorld();
    }

    @Test
    public void testGetStringStartWithWordHello() {
        helloEdpServiceSteps.shouldGetStringStartWithWordHello();
    }

    @Test
    public void testGetStringWhichNotNull() {
        helloEdpServiceSteps.shouldGetStringWhichNotNull();
    }

    @Test
    public void testGetStringEndsWithExclamationMark() {
        helloEdpServiceSteps.shouldGetStriEndsWithExclamationMark();
    }
}