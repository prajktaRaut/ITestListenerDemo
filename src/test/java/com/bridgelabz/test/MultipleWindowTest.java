package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.base.IAutoConstant;
import com.bridgelabz.model.HandleMultipleWindow;
import org.testng.annotations.Test;

public class MultipleWindowTest extends BaseClass implements IAutoConstant {

    @Test
    public void handleMultipleWindowsUsingWindowHandles() {
        driver.get("http://demo.guru99.com/popup.php");
        HandleMultipleWindow handleWindow = new HandleMultipleWindow(driver);
        handleWindow.clickOnClickHereButton();
        handleWindow.handleMultipleWindow(driver);
    }
}
