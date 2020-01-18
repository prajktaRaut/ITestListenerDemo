package com.bridgelabz.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

public class Screenshots extends BaseClass{

    public void getScreenShots(WebDriver driver, String testName)
    {
        try {
            TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
            System.out.println("Driver:"+driver);
            File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("/home/slot1/Documents/PrajktaRaut/Project/IListenaerDemo/src/test/resources/ScreenshotsOfPages/"+testName+ LocalDateTime.now() +".jpg");
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
