package com.bridgelabz.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class UploadAndDownloadFile {

    @FindBy(id = "imagesrc")
    WebElement chooseFile;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement downloadFile;

    public UploadAndDownloadFile(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void uploadFile(String fileName)
    {
        chooseFile.sendKeys(fileName);
    }

    public void downloadFile()
    {
        downloadFile.click();
    }

}
