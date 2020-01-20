package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.model.ReadPdf;
import org.testng.annotations.Test;
import java.io.IOException;

public class ReadPdfTest extends BaseClass {

    @Test
    public void readPdf() throws IOException {

        ReadPdf readPdf = new ReadPdf();
        readPdf.readPdfAndGetPdfData();

    }
}
