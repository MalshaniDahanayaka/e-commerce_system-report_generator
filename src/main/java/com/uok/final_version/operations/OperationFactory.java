package com.uok.final_version.operations;



import com.uok.final_version.email.emailSender.gmail.GmailSMTP;
import com.uok.final_version.fileOperations.ExcelFileWrite;
import com.uok.final_version.repository.SqlDataRepository;

import javax.mail.MessagingException;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperationFactory{

    public String[] arguments;
    public StringBuilder inFormationsString = new StringBuilder();
    public  ResultSet SqlResultReport;

    public OperationFactory(String[] arguments){
        this.arguments = arguments;


    }


    public void getInstance() throws SQLException, FileNotFoundException, MessagingException {


        if (arguments[0].equals("user_signup") || arguments[0].equals("monthly_sales")) {
               SqlResultReport =  new SqlDataRepository(arguments[0],arguments[1],arguments[2]).GetSqlDataForReport();



        } if (arguments[0].equals("user_signup")) {

            inFormationsString = new UserInformation(SqlResultReport).getUserInformation();


        }if(arguments[0].equals("monthly_sales")){

            inFormationsString = new SalesInformation(SqlResultReport).getSalesInformation();


        }if(arguments[3].equals("email") || arguments[3].equals("file")){

            new ExcelFileWrite(inFormationsString,arguments[0]).printToExcel();


        }if(arguments[3].equals("email") && (arguments[4].equals("skasunmk98@gmail.com") || arguments[4].equals("mekaladahanayaka80@gmail.com"))){
            String filename = arguments[0];
            String filePath = "D:\\csv\\"+filename+"Report.csv";
            GmailSMTP gmailSMTP = new GmailSMTP();
            gmailSMTP.sendEmail(arguments[4],filePath);
        }


    }
}
