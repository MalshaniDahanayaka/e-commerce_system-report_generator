package readData;

import readData.operations.ExcelfileReader;
import readData.operations.OperationFactory;
import readData.operations.StringJoiner;
import readData.repository.SqlDataRepository;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {

        try {


            String TypeOfReport = "user_signup";
            String Email = "john98@gmail.com";
            String startTime = "2020-05-23";
            String endTime = "2020-06-25";
            String receivingMethod = "excelFile";

//            new OperationFactory(TypeOfReport);
//            new ReportSendingApp(TypeOfReport,Email,startTime,endTime,receivingMethod);

            ResultSet rs = new SqlDataRepository(TypeOfReport).GetSqlDataForReport();


             StringBuilder  sb = new StringBuilder();

             sb = new StringJoiner().getInformationArray(rs);

             new ExcelfileReader(sb).printToExcel();




        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}