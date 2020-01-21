package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.model.DragAndDrop;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDropTest extends BaseClass {

    DragAndDrop dragAndDrop;

    @Test
    public void performDragAndDropOperation(){
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        dragAndDrop = new DragAndDrop(driver);
        dragAndDrop.selectButtonToDragAndDrop(driver);
    }
}
