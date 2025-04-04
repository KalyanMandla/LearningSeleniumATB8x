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

public class Task04_File_Upload {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }
    @Description("Verify File Upload")
    @Test
    public void test_file_Upload() throws InterruptedException {

        driver.get("https://app-automate.browserstack.com/dashboard/v2/getting-started");
        driver.manage().window().maximize();
//        WebElement uploadFileInput = driver.findElement(By.id("file"));
//        uploadFileInput.click();

//        String working_dir = System.getProperty("user.dir");
//        System.out.println(working_dir);

        //uploadFileInput.sendKeys("C:/Users/MANDKALY/Downloads/com.wt.apkinfo-2.2.8-free-www.apksum.com 1.apk/src/test/java/com/thetestingacademy/Tasks/Task04_File_Upload.java");
        //driver.findElement(By.name("submit")).click();


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
