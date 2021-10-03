package com.uok.final_version.fileOperations;

import com.uok.final_version.input.InvalidInputException;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ExcelFileWriteTest {


            @Test
            public void should_write_data_to_excel_file() throws InvalidInputException, FileNotFoundException {
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append("UserID");
                stringBuilder.append(",");
                stringBuilder.append("Username");
                stringBuilder.append(",");
                stringBuilder.append("User-Email");
                stringBuilder.append(",");
                stringBuilder.append("\r\n");

                ExcelFileWrite excelFileWrite = new ExcelFileWrite(stringBuilder,"monthly_salesReport");
                String result = excelFileWrite.printToExcel();
                assertEquals(result,"finished");



        }

}