package com.bridgelabz.base;

import com.bridgelabz.properties.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseClass implements IAutoConstant{

    public String methodName;
    public static WebDriver driver;
    ChromeOptions options = new ChromeOptions();

    @BeforeMethod
    public void setUp(Method method) {
        methodName=method.getName();
        options.addArguments("--disable-notifications");
        System.setProperty(CHROMEKEY,CHROMEVALUE);
        driver = new ChromeDriver(options);
        String url = Library.getProperty(CONFIG, "URL");
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
