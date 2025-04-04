package com.thetestingacademy.ex09_03042025_Selenium_Exceptions;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium52_Selenium_StaleElementReference_Actual {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }

    @Description("Verify Selenium_StaleElementReference_Exception")
    @Test
    public void test_staleElementReference_exception() throws InterruptedException {

        try {
            driver.get("https://www.google.com");
            WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh();
            // HTML Page (DOM) is not refreshing.
            // Driver will think that, element mat or may not available now.
            // I have found the element before refresh
            // Refresh, Navigate other Page, Change in DOM elements (Ajax Calls)

            // If you want to fix the stale element exp - re-find the element after DOM changes
            //search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

            search_inputbox.sendKeys("thetestingacademy" + Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Other code can run that's why");
        System.out.println("End of the Program");
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
