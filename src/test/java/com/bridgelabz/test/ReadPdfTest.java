package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.model.ReadPdf;
import org.testng.annotations.Test;
import java.io.IOException;

public class ReadPdfTest extends BaseClass {

    @Test
    public void readPdf() throws IOException {
        driver.get("http://www.vandevenbv.nl/dynamics/modules/SFIL0200/view.php?fil_Id=5515");
        ReadPdf readPdf = new ReadPdf();
        readPdf.readPdfAndGetPdfData();
    }
}
