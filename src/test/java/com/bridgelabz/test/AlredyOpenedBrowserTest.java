package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlredyOpenedBrowserTest{

    @Test
    public void performOperationOnAlreadyOpenedBrowser() {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress","localhost:9018");
        WebDriver driver = new ChromeDriver(options);
        driver.findElement(By.id("fakebox-input")).sendKeys("What is selenium");
    }
}
