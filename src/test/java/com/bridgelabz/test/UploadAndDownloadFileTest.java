package com.bridgelabz.test;

import com.bridgelabz.base.IAutoConstant;
import com.bridgelabz.model.UploadAndDownloadFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadAndDownloadFileTest implements IAutoConstant {

    WebDriver driver;
    UploadAndDownloadFile uploadAndDownloadFile;

    @BeforeMethod
    public void setUp() {
        System.setProperty(CHROMEKEY,CHROMEVALUE);
         driver = new ChromeDriver();
         uploadAndDownloadFile = new UploadAndDownloadFile(driver);
    }

    @Test
    public void uploadFile(){
        driver.get("http://demo.automationtesting.in/Register.html");
        uploadAndDownloadFile.uploadFile("/home/slot1/Downloads/006 Email Samples(1).pdf");
    }

    @Test
    public void downloadFile()
    {
        driver.get("http://demo.automationtesting.in/FileDownload.html");
        uploadAndDownloadFile.downloadFile();
    }
}
