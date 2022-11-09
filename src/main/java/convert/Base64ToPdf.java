package convert;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Base64ToPdf {

    public String convertBase64ToPdf(String token) {
        File file = new File("./test.pdf");
        String actualName = null;
        try (FileOutputStream fos = new FileOutputStream(file);) {
            // To be short I use a corrupted PDF string, so make sure to use a valid one if you want to preview the PDF file
            String b64 = token;
            byte[] decoder = Base64.getDecoder().decode(b64);

            fos.write(decoder);
            actualName = readPDF(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return actualName;
    }

    public String readPDF(File file) {
        String substring = null;
        try {
            PDDocument document = PDDocument.load(file);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(document);
            StringBuffer sb = new StringBuffer();
            sb.append(text);
            int startingIndex = sb.indexOf("Nama :", 0);
            substring = sb.substring(startingIndex, startingIndex + 50);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return substring;
    }
}
