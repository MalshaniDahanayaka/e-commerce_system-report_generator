package com.uok.final_version.fileOperations;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExcelFileWrite {

    StringBuilder stringBuilder;
    String filename ;
    public ExcelFileWrite(StringBuilder sb,String filename){
        this.stringBuilder = sb;
        this.filename = filename;
    }

    public String printToExcel() throws FileNotFoundException {

        PrintWriter printWriter= new PrintWriter("D:\\csv\\"+filename+"Report.csv");
        printWriter.write(stringBuilder.toString());
        printWriter.close();
        return  "finished";
    }


}
