package com.web.base.pagesteps;

import com.web.base.pages.ExamplePage;
import com.thoughtworks.gauge.Step;
import com.web.base.utils.driver.Driver;

public class BaseSteps {

    public static String APP_URL = System.getenv("APP_URL");
    // user.properties'dan gelen url ile siteye giriş yapıldı.
    @Step("Verilen siteye gidilir.")
    public void goURL() {
        Driver.webDriver.get(APP_URL);
        Driver.webDriver.manage().window().maximize();
    }
}

