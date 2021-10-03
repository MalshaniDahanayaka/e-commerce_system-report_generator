package com.uok.v3;


import com.uok.v3.operations.OperationFactory;
import com.uok.v3.repository.DataRepositoryException;

import javax.mail.MessagingException;
import java.io.FileNotFoundException;
import java.sql.SQLException;


public class ReportSenderApp {

    private static String[] inputs;

    public ReportSenderApp(String[] inputs){
        this.inputs = inputs;

    }

    public static void execute() throws  DataRepositoryException {


        try {
            try {
                new OperationFactory(inputs).getInstance();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }

}
