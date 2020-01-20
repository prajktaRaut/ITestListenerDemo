package com.bridgelabz.model;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandleAlertPopup {

    @FindBy(id = "login1")
    WebElement username;

    @FindBy(name = "proceed")
    WebElement loginBtn;

    public HandleAlertPopup(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    public void setUsername(String name)
    {
        username.sendKeys(name);
    }

    public void clickOnLoginBtn()
    {
        loginBtn.click();
    }

    public void alert(WebDriver driver) throws InterruptedException {

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);

        // Accepting alert
        alert.accept();
    }
}
