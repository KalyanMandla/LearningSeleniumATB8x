package com.thetestingacademy.ex09_03042025_Actions_Advance;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium57_Relative_Locator {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }
    @Description("Verify RL")
    @Test
    public void test_relative_locator_p2() throws InterruptedException {

        String URL = "https://www.aqi.in/real-time-most-polluted-city-ranking";
        driver.get(URL);
        driver.manage().window().maximize();

        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name > p"));
        for (WebElement e : locations){
            System.out.println(e.getText());
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(e)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(e)).getText();
            System.out.println(e.getText() + " | " + rank + " | " + aqi);

        }

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
