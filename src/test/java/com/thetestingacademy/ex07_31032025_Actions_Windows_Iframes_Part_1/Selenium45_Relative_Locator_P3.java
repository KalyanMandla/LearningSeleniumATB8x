package com.thetestingacademy.ex07_31032025_Actions_Windows_Iframes_Part_1;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium45_Relative_Locator_P3 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }
    @Description("Verify RL")
    @Test
    public void test_relative_locator_p3() throws InterruptedException {

        String URL = "https://codepen.io/AbdullahSajjad/full/LYGVRgK";
        driver.get(URL);
        driver.manage().window().maximize();

        Thread.sleep(15000);

        // iframe
        driver.switchTo().frame("result");

       WebElement submit = driver.findElement(By.xpath("//form[@id='form']/button"));
       submit.click();

       WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
       WebElement errorElement = driver.findElement(with(By.tagName("small")).below(element));

       String errorText = errorElement.getText();
       Assert.assertTrue(errorElement.isDisplayed());
       Assert.assertEquals(errorText,"Username must be at least 3 characters");

       Thread.sleep(3000);

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
