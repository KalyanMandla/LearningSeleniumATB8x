package com.thetestingacademy.ex01_24032025;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium05 {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.quit();

    }
}
