package com.thetestingacademy.ex03_25032025_LocatorsPart_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium15 {
    @Test
    public void testMethod1() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        // edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointment = driver.findElement(By.id("btn-make-appointment"));
        makeAppointment.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement buttonlogin = driver.findElement(By.id("btn-login"));
        buttonlogin.click();

//        // Make Appointment
//        WebElement facility_list = driver.findElement(By.id("combo_facility"));
//        facility_list.click();





        driver.quit();
    }
}