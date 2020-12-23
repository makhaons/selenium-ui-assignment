package com.selenium.test.teststeps;

import com.selenium.main.utilities.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DriverManager {

    @Before
    public void setDriver() {
        driver = getDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}
