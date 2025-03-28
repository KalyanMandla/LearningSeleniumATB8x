package com.thetestingacademy.ex05_27032025_Waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Selenium26_Alerts {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        // WebElement element = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        // WebElement elementConfirm = driver.findElement(By.xpath(" //button[text()='Click for JS Confirm']"));
        WebElement elementPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

        // element.click();
        // elementConfirm.click();
        elementPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Pramod");
        alert.accept();
        // alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
        // Assert.assertEquals(result,"You successfully clicked an alert");
        // Assert.assertEquals(result,"You clicked: Ok");
        // Assert.assertEquals(result,"You clicked: Cancel");
        Assert.assertEquals(result,"You entered: Pramod");


        driver.quit();
    }
}
