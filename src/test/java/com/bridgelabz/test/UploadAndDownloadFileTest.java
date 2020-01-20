package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.base.IAutoConstant;
import com.bridgelabz.model.UploadAndDownloadFile;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UploadAndDownloadFileTest extends BaseClass implements IAutoConstant {


    UploadAndDownloadFile uploadAndDownloadFile;

    @Test
    public void uploadFile(){
        uploadAndDownloadFile = new UploadAndDownloadFile(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        uploadAndDownloadFile.uploadFile("/home/slot1/Downloads/006 Email Samples(1).pdf");
    }

    @Test
    public void downloadFile()
    {
        uploadAndDownloadFile = new UploadAndDownloadFile(driver);
        uploadAndDownloadFile.downloadFile();
    }
}
