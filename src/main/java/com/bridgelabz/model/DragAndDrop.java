package com.bridgelabz.model;

import com.bridgelabz.base.IAutoConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class DragAndDrop implements IAutoConstant {

    @FindBy(xpath = "//*[@id='credit2']/a")
    WebElement from;

    @FindBy(xpath = "//*[@id='bank']/li")
    WebElement to;

    public DragAndDrop(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void selectButtonToDragAndDrop(WebDriver driver)
    {
        Actions act = new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
    }
}
