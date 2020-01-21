package com.bridgelabz.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class HandleMultipleWindow {

    @FindBy(xpath="//*[contains(@href,'popup.php')]")
    WebElement clickHereBtn;

    public HandleMultipleWindow(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void clickOnClickHereButton()
    {
        clickHereBtn.click();
    }

    public void handleMultipleWindow(WebDriver driver)
    {
        String MainWindow=driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();
        while(i1.hasNext())
        {
            String ChildWindow=i1.next();
            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("gaurav.3n@gmail.com");
                driver.findElement(By.name("btnLogin")).click();
                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }

}
