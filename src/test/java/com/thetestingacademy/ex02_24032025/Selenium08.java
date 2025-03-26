package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium08 {
    public static void main(String[] args) throws InterruptedException {


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/");

        Thread.sleep(5000);

        // driver.close();
        driver.quit();

    }
}
