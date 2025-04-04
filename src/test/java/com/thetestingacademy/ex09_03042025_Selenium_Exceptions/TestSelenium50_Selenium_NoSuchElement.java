package com.thetestingacademy.ex09_03042025_Selenium_Exceptions;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium50_Selenium_NoSuchElement {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }

    @Description("Verify Selenium_NoSuchElement_Exception")
    @Test
    public void test_noSuchElement_exception() throws InterruptedException {

        String URL = "https://app.vwo.com";
        driver.get(URL);
        driver.manage().window().maximize();

        // driver.findElement(By.id("Pramod"));

        try {
            driver.findElement(By.id("Pramod"));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        driver.get("https://www.google.com");

    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
