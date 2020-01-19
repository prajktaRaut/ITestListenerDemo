package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.base.IAutoConstant;
import com.bridgelabz.model.UploadAndDownloadFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UploadAndDownloadFileTest extends BaseClass implements IAutoConstant {


    UploadAndDownloadFile uploadAndDownloadFile;

    @Test
    public void uploadFile(){
        driver.get("http://demo.automationtesting.in/Register.html");
        uploadAndDownloadFile = new UploadAndDownloadFile(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        uploadAndDownloadFile.uploadFile("/home/slot1/Downloads/006 Email Samples(1).pdf");
    }

    @Test
    public void downloadFile()
    {
        driver.get("http://demo.automationtesting.in/FileDownload.html");
        uploadAndDownloadFile = new UploadAndDownloadFile(driver);
        WebDriverWait driverWait = new WebDriverWait(driver,20);
        uploadAndDownloadFile.downloadFile();
    }
}
