package com.bank.testbase;

import com.bank.basepage.BasePage;
import com.bank.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    //object creation
    BrowserSelector browserSelector = new BrowserSelector();

    //project Url
    String baseUrl = "http://www.way2automation.com/angularjs-protractor/banking/#/login";

    //opens browser
    @BeforeTest
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    //close browser
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
