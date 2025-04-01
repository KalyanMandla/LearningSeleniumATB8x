package com.thetestingacademy.Tasks;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Task3_WebTables_Dynamic {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }
    @Description("Verify Web Tables")
    @Test
    public void test_web_tables() throws InterruptedException {
        driver.manage().window().maximize();
        String URL = "https://awesomeqa.com/webtable1.html";
        driver.get(URL);
        driver.manage().window().maximize();

        // Find the xpath for the web table
        // //table[@summary='Sample Table']/tbody
        //  table[summary='Sample Table'] tbody
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        // rows and columns
        List<WebElement> rows_table = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows_table.size(); i++) {
            List<WebElement> col = rows_table.get(i).findElements(By.tagName("td"));
            for (WebElement c : col){
                System.out.println(c.getText());
            }
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

//div[@role='table']  - for table
//div[@role='row']  - For all rows this
