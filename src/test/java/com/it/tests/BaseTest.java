package com.it.tests;

import com.it.App;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected App app = new App();



    @AfterSuite
    public void afterSuite() {
        app.common.stopApp();
    }
}
