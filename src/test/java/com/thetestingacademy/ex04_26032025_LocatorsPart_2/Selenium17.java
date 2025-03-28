package com.thetestingacademy.ex04_26032025_LocatorsPart_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium17 {

    @Test
    public void testMethod1() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        // edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

       // WebElement username_input_id = driver.findElement(By.id("username"));

        WebElement username_input_xpath = driver.findElement(By.xpath("//input[@name='username']"));
        username_input_xpath.sendKeys("augtest_040823@idrive.com");

        WebElement password_input_xpath = driver.findElement(By.xpath("//input[@id='password']"));
        password_input_xpath.sendKeys("123456");

        WebElement signin_button_xpath = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        signin_button_xpath.click();

        Thread.sleep(3000);

        WebElement free_trail_text = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        Assert.assertEquals(free_trail_text.getText(),"Your free trial has expired");



        driver.quit();
    }
}
