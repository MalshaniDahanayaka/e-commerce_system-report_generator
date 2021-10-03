package com.uok.v3.operations;


import com.uok.v3.email.SentEmail;
import com.uok.v3.repository.SqlDataRepository;

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

    public void getInstance() throws SQLException , FileNotFoundException {



        if (arguments[0].equals("user_signup") || arguments[0].equals("monthly_sales")) {
               SqlResultReport =  new SqlDataRepository(arguments[0],arguments[1],arguments[2]).GetSqlDataForReport();



        } if (arguments[0].equals("user_signup")) {



            inFormationsString = new StringJoiner().getUserInformationArray(SqlResultReport);


        }if(arguments[0].equals("monthly_sales")){


            inFormationsString = new StringJoiner().getSalesInformationArray(SqlResultReport);

        }if(arguments[3].equals("email") || arguments[3].equals("file")){

            new ExcelfileReader(inFormationsString).printToExcel();


        }if(arguments[4].equals("skasunmk98@gmail.com") || arguments[4].equals("mekaladahanayaka80@gmail.com")){
            String filePath = "D:\\csv\\productReport.csv";
            new SentEmail().sendMail(arguments[4],filePath);
        }


    }
}
