package com.bridgelabz.model;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleBrowserPopupWindow {

    public void handleBrowserPopupWindow(WebDriver driver)
    {
        String parentWindow = driver.getWindowHandle();
        // It returns no. of windows opened by WebDriver and will return Set of Strings
        Set<String> set =driver.getWindowHandles();
        // Using Iterator to iterate with in windows
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
            String childWindow=itr.next();
            // Compare whether the main windows is not equal to child window. If not equal, we will close.
            if(!parentWindow.equals(childWindow)){
                driver.switchTo().window(childWindow);
                System.out.println(driver.switchTo().window(childWindow).getTitle());
                driver.close();
            }
        }
        // This is to switch to the main window
        driver.switchTo().window(parentWindow);
    }

}
