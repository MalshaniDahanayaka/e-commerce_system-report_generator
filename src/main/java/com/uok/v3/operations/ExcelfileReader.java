package readData.operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExcelfileReader {

    StringBuilder sb ;
    public ExcelfileReader(StringBuilder sb){
        this.sb = sb;
    }

    public void printToExcel() throws FileNotFoundException {

        PrintWriter pw= new PrintWriter(new File("D:\\csv\\productReport.csv"));
        pw.write(sb.toString());
        pw.close();
        System.out.println("finished");
    }

}
