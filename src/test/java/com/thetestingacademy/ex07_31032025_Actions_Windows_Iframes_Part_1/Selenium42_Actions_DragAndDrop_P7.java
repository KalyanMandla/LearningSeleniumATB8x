package com.thetestingacademy.ex07_31032025_Actions_Windows_Iframes_Part_1;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium42_Actions_DragAndDrop_P7 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }
    @Description("Verify Drag and Drop")
    @Test
    public void test_drag_and_drop_p7() throws InterruptedException {

        String URL = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(URL);
        driver.manage().window().maximize();

       Actions actions = new Actions(driver);

       WebElement from = driver.findElement(By.id("column-a"));
       WebElement to = driver.findElement(By.id("column-b"));

       actions.dragAndDrop(from,to).perform();

       // actions.clickAndHold(from).moveToElement(to).release(to).build().perform();


    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
