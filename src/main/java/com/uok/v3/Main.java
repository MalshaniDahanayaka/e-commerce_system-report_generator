package com.uok.v3;

import readData.input.CommandLineInputs;
import readData.input.InavalidInputException;
import readData.repository.DataRepositoryException;

import java.io.FileNotFoundException;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws InavalidInputException, SQLException, DataRepositoryException, FileNotFoundException {


        String[] inputs = new CommandLineInputs(args).getArguments();
        new ReportSendingApp(inputs);
        ReportSendingApp.execute();





    }
}