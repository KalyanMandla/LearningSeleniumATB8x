package com.thetestingacademy.ex03_25032025_LocatorsPart_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium13 {
    @Test
    public void testMethod1() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");


        WebElement link_free_trail_element = driver.findElement(By.linkText("Start a free trial"));
        link_free_trail_element.click();














        Thread.sleep(3000);
        driver.quit();
    }
}
