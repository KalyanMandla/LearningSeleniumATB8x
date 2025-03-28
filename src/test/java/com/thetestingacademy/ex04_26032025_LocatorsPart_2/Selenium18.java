package com.thetestingacademy.ex04_26032025_LocatorsPart_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium18 {

    @Test
    public void testMethod1() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        // edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        // input[id='gh-ac'] - CSS Selector
        WebElement searchBox = driver.findElement(By.xpath(" //input[@id='gh-ac']"));
        searchBox.sendKeys("macmini");

        WebElement searchButton = driver.findElement(By.xpath("//span[@class='gh-search-button__label']"));
        searchButton.click();

        Thread.sleep(3000);

        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-card__title']"));
        List<WebElement> searchTitlesPrices = driver.findElements(By.xpath("//div[@class='s-card__attribute-row']"));

        int size = Math.min(searchTitlesPrices.size(),searchTitles.size());

        Thread.sleep(3000);

        for (int i = 0; i < size; i++) {
            System.out.println("Title : " + searchTitles.get(i).getText() + "||" + "Prices : " + searchTitlesPrices.get(i).getText());

        }




        driver.quit();
    }
}