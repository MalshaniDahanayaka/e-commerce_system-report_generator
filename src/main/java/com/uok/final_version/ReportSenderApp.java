package com.uok.final_version;


import com.uok.final_version.operations.OperationFactory;
import javax.mail.MessagingException;
import java.io.FileNotFoundException;
import java.sql.SQLException;


public class ReportSenderApp {

    private static String[] inputs;

    public ReportSenderApp(String[] inputs){
        this.inputs = inputs;

    }

    public static void execute() throws SQLException, MessagingException, FileNotFoundException {

        new OperationFactory(inputs).getInstance();



    }

}
