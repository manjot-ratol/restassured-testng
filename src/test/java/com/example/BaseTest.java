package com.example;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

/**
 * Unit test for simple App.
 */
public class BaseTest {
    /**
     * Rigorous Test :-)
     */
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://restcountries.com/v3.1";

        // Log request details
        RestAssured.requestSpecification = RestAssured.given()
                .log()
                .all(); // Log all details (method, URL, headers, body)

        RestAssured.responseSpecification = RestAssured.expect()
                .log()
                .all(); // Log all details of the response (status, headers, body)

    }
}
