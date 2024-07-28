package com.example.tests;

import org.testng.annotations.Test;

import com.example.BaseTest;
import com.example.utils.DataProviderUtil;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ExampleTest extends BaseTest {

    @Test(dataProvider = "countries", dataProviderClass = DataProviderUtil.class)
    public void testGetCountries(String coutryId, String expectedName) {
        given()
            .pathParam("coutryId", coutryId)
        .when()
            .get("/name/{coutryId}")
        .then()
            .statusCode(200)
            .body("[0].name.official", equalTo(expectedName));
    }
}
