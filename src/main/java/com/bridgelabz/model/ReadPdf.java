package com.bridgelabz.model;

import com.bridgelabz.base.BaseClass;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ReadPdf extends BaseClass {

    public void readPdfAndGetPdfData() throws IOException {

        URL url = new URL(driver.getCurrentUrl());
        InputStream inputStream=url.openStream();
        BufferedInputStream fileToParse = new BufferedInputStream(inputStream);
        PDDocument document=null;
        String output=null;
        try {
            document = PDDocument.load(fileToParse);
            output = new PDFTextStripper().getText(document);
            System.out.println(output);
        }
        finally {
            if (document != null)
            {
                document.close();
            }
            fileToParse.close();
            inputStream.close();
        }
    }
}
