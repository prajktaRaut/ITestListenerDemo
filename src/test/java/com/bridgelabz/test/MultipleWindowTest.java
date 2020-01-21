package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.base.IAutoConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindowTest implements IAutoConstant {

    @Test
    public void testName() throws InterruptedException {

        System.setProperty(CHROMEKEY,CHROMEVALUE);
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent window's handle -> " + parentWindowHandle);
        WebElement clickElement = driver.findElement(By.id(""));

        for(int i = 0; i < 3; i++)
        {
            clickElement.click();
            Thread.sleep(3000);
        }

        Set<String> allWindowHandles = driver.getWindowHandles();

        for(String handle : allWindowHandles)
        {
            System.out.println("Switching to window - > " + handle);
            System.out.println("Navigating to google.com");
            driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
            driver.get("http://google.com");
            driver.close();
        }

    }
}
