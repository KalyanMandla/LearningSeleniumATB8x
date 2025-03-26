package com.thetestingacademy.ex01_24032025;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium01 {

    @Test
    public void test_Selenium(){

        // Selenium 3
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Selenium 4
        FirefoxDriver driver = new FirefoxDriver();
        // EdgeDriver driver1 = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();

    }
}
