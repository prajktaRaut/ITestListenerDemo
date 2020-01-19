package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.model.LoginPages;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.bridgelabz.base.Listener.class)
public class ScreenshotsTest extends BaseClass {

    @Test
    public void getScreenShotsUsingITestListener() {
        LoginPages loginPages = new LoginPages(driver);
        driver.get("https://www.facebook.com");
        loginPages.setUserName("9764324126");
        loginPages.setPasswordField("Psraut@123");
        loginPages.clickLoginButton();
    }
}
