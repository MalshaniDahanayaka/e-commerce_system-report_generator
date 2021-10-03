package com.uok.final_version;

import com.uok.final_version.input.CommandLineInputs;
import com.uok.final_version.input.InvalidInputException;

import javax.mail.MessagingException;
import java.io.IOException;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws InvalidInputException {


        try {
            String[] inputs = new CommandLineInputs(args).getArguments();
            new ReportSenderApp(inputs);
            ReportSenderApp.execute();

        } catch (IOException | SQLException | MessagingException e) {

            throw new InvalidInputException((IOException) e,"couldn read args...");

        }


    }
}