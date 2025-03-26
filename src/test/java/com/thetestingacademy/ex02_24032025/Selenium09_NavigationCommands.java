package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Selenium09_NavigationCommands {

    @Test
    public void testMethod1() throws MalformedURLException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

        // navigate.to, forward, back
        driver.navigate().to("https://thetestingacademy.com");
        // driver.navigate().to(new URL("https://courses.thetestingacademy.com/"));
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getTitle());




    }
}
