package com.thetestingacademy.ex09_03042025_Actions_Advance;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium56_Actions_JS {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }

    @Description("Verify JS")
    @Test
    public void test_js() throws InterruptedException {

        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);", div_to_scroll);
        // js.executeScript("window.scrollTo(0,1000)"); // another method for scroll
//        String html = (String) js.executeScript("arguments[0].innerHTML;", div_to_scroll);
//        System.out.println(html);



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
