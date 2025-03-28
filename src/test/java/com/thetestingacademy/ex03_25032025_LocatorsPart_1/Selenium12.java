package com.thetestingacademy.ex03_25032025_LocatorsPart_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium12 {

    @Test
    public void testMethod1() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        // Assert.assertEquals(driver.getTitle(),"Login - VWO");
        // Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        // Find email inputbox and enter the mail
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("kalyan@gmail.com");

        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("admin123");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Thread.sleep(3000);

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        assertThat(error_message.getText()).isNotEmpty().isNotBlank().isEqualTo("Your email, password, IP address or location did not match");




        driver.quit();
    }
}
