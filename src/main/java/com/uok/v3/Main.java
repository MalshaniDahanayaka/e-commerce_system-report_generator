package com.uok.v3;

import com.uok.v3.input.CommandLineInputs;
import com.uok.v3.input.InvalidInputException;
import com.uok.v3.repository.DataRepositoryException;


public class Main {
    public static void main(String[] args) throws InvalidInputException, DataRepositoryException {


        String[] inputs = new CommandLineInputs(args).getArguments();
        new ReportSenderApp(inputs);
        ReportSenderApp.execute();


    }
}