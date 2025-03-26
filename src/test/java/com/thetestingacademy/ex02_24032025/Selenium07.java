package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium07 {

    @Test
    public void testMethod1(){

        EdgeOptions edgeOptions = new EdgeOptions();
        // src/test/java/com/thetestingacademy/ex02_24032025/adblock.crx
        edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex02_24032025/adblock.crx"));

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://youtube.com");


    }
}
