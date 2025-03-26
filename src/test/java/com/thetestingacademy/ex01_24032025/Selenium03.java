package com.thetestingacademy.ex01_24032025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium03 {

    @Test
    public void test_Selenium(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");

    }
}
