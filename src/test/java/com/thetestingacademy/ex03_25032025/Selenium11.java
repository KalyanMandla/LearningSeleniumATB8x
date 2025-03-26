package com.thetestingacademy.ex03_25032025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium11 {

    @Test
    public void testMethod1(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // HTML element -> Web Element - Selenium
        // Web Element Find - Interact with it

        // How to find elements
        // Selenium
        //ID, NAME, CLASS NAME, TAGNAME
        // Advance - Xpath, CSS Selector






    }

}
