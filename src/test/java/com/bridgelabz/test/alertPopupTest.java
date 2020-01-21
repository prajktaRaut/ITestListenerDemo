package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.model.HandleAlertPopup;
import org.testng.annotations.Test;

public class alertPopupTest extends BaseClass {

    @Test
    public void handleAlertPopup() throws InterruptedException {

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        HandleAlertPopup handlePopup = new HandleAlertPopup(driver);
        handlePopup.setUsername("DeepaliPatil210");
        handlePopup.clickOnLoginBtn();
        handlePopup.alert(driver);
    }

}
