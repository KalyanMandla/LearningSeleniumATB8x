package com.thetestingacademy.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Task01 {

    @Test
    public void testMethod1() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        // edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("KK");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("MK");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.xpath("//input[@id='exp-2']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("26/03/2025");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        driver.findElement(By.xpath("//button[@id='submit']")).click();


        driver.quit();
    }
}
