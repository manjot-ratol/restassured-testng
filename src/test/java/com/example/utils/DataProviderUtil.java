package com.example.utils;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
    @DataProvider(name = "countries")
    public static Object[][] createUserIds() {
        return new Object[][] {
                { "india", "Republic of India" },
                { "usa", "United States of America" }
        };
    }
}
