package com.thetestingacademy.ex05_27032025_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium24_InputBox_CheckBox_RadioBox {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        // Radio Box
        driver.findElement(By.id("sex-0")).click();

        // Check Box
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();



        driver.quit();

    }
}
