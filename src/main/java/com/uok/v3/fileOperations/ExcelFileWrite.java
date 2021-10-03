package com.uok.v3.fileOperations;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExcelFileWrite {

    StringBuilder sb  ;
    String filename ;
    public ExcelFileWrite(StringBuilder sb,String filename){
        this.sb = sb;
        this.filename = filename;
    }

    public void printToExcel() throws FileNotFoundException {

        PrintWriter pw= new PrintWriter("D:\\csv\\"+filename+"Report.csv");
        pw.write(sb.toString());
        pw.close();
        System.out.println("finished");
    }


}
