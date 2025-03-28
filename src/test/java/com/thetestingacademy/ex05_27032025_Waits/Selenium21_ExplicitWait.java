package com.thetestingacademy.ex05_27032025_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium21_ExplicitWait {

    @Test
    public void testMethod1() throws InterruptedException {

//        EdgeOptions edgeOptions = new EdgeOptions();
//        //edgeOptions.addArguments("--incognito");
//        edgeOptions.addArguments("--start-maximized");

        //WebDriver driver = new EdgeDriver(edgeOptions);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        // Condition
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
