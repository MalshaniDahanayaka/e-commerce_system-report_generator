package com.uok.v3.repository;


import com.uok.v3.operations.OperationFactory;

import java.io.FileNotFoundException;
import java.sql.SQLException;


public class ReportSendingApp {

    private static String[] inputs;

    public ReportSendingApp(String[] inputs){
        this.inputs = inputs;

    }

    public static void execute() throws SQLException, DataRepositoryException, FileNotFoundException {


        new OperationFactory(inputs).getInstance();



    }

}
