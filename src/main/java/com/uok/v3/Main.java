package com.uok.v3;



import com.uok.v3.input.CommandLineInputs;
import com.uok.v3.input.InavalidInputException;
import com.uok.v3.repository.DataRepositoryException;
import com.uok.v3.repository.ReportSendingApp;

import java.io.FileNotFoundException;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws InavalidInputException, SQLException, DataRepositoryException, FileNotFoundException {


        String[] inputs = new CommandLineInputs(args).getArguments();
        new ReportSendingApp(inputs);
        ReportSendingApp.execute();


    }
}