package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.model.HandleBrowserPopupWindow;
import org.testng.annotations.Test;

public class BrowserPopupTest extends BaseClass {

    @Test
    public void handleBrowserPopupUsingWindowHandler()
    {
        driver.get("http://www.naukri.com/");
        HandleBrowserPopupWindow handleWindow = new HandleBrowserPopupWindow();
        handleWindow.handleBrowserPopupWindow(driver);
    }
}
