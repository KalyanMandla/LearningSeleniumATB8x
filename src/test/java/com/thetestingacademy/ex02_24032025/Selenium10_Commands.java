package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium10_Commands {

    @Test
    public void testMethod1() throws Exception {

//        EdgeDriver driver = new EdgeDriver();
//       // driver.get("sdet.live"); // It will not working
//       // driver.get("https://sdet.live");
//        driver.get("http://sdet.live");

        // Important Commands
//        1. getTitle()
//        2. getCurrentURL()
//        3. getPageSource()

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // Alternate way to maximize
        // driver.manage().window().maximize();

        // TestNG Assertion
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        // AssertJ Assertion
        assertThat(driver.getTitle()).isEqualTo("CURA Healthcare Service").isNotBlank().isNotEmpty();
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertTrue(true);
        }else{
            throw new Exception("Heading not Found!!");
        }

        driver.quit();

    }
}
