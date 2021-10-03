package com.uok.final_version.fileOperations;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelFileDeletionTest {


    @Test
    public void should_delete_file_after_send_mail()  {

        ExcelFileDeletion excelFileDeletion = new ExcelFileDeletion("D:\\csv\\monthly_salesReport.csv");
        boolean result = excelFileDeletion.deleteFileAfterMail();
        assertEquals(result,true);



    }

}