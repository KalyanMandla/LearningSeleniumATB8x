package com.thetestingacademy.ex01_24032025;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium06 {

    @Test
    public void testMethod1(){

        // EdgeOptions -> It will help you set the browser
        // options to browser
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https, http
        // localStorage, download

        EdgeOptions edgeOptions = new EdgeOptions();
        // edgeOptions.addArguments("---start-maximized");
        edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.addArguments("--incognito");
       // edgeOptions.addArguments("--headless");


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
