package com.thetestingacademy.ex05_27032025_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.function.Function;

import static com.thetestingacademy.ex05_27032025_Waits.WaitHelpers.checkVisibilityByFluentWait;
import static org.assertj.core.api.Assertions.assertThat;

public class Selenium22_FluentWait {

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

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // WebElement error_message = driver.findElement(By.className("notification-box-description"));

        // Condition
//        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                        .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
//
//        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.className("notification-box-description"));
//            }
//        });

        WebElement error_message = checkVisibilityByFluentWait(driver,By.className("notification-box-description"));


        // WebElement error_message = driver.findElement(By.className("notification-box-description"));
       Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");




        driver.quit();
    }
}
