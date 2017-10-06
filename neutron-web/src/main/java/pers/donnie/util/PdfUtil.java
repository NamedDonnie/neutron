package pers.donnie.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfUtil {

    public static void getPdf() {

        String templatePdfPath = "C:\\Java\\aPdf.pdf";
        String newPdfPath = "C:\\Java\\aNewPdf.pdf";

        PdfReader pdfReader;
        FileOutputStream fileOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        PdfStamper pdfStamper;

        try {
            fileOutputStream = new FileOutputStream(newPdfPath);//输出流
            pdfReader = new PdfReader(templatePdfPath);
            byteArrayOutputStream = new ByteArrayOutputStream();
            pdfStamper = new PdfStamper(pdfReader,byteArrayOutputStream);
            AcroFields AcroFields = pdfStamper.getAcroFields();

            String[] str = { "123456789", "TOP__ONE", "男", "130222111133338888", "河北省保定市" };
            int i = 0;

            java.util.Iterator<String> it = AcroFields.getFields().keySet().iterator();
            while (it.hasNext()) {
                String name = it.next().toString();
                System.out.println(name);
                AcroFields.setField(name, str[i++]);
            }
            pdfStamper.setFormFlattening(true);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
            pdfStamper.close();

            Document doc = new Document();
            PdfCopy copy = new PdfCopy(doc, fileOutputStream);
            doc.open();
            PdfImportedPage importPage = copy.getImportedPage(new PdfReader(byteArrayOutputStream.toByteArray()), 1);
            copy.addPage(importPage);
            doc.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
        }

    }

    public static void main(String[] args) {
        getPdf();
    }

}
