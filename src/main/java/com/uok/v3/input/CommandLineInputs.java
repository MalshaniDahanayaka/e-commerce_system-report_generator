package com.uok.v3.input;

import java.util.Arrays;

public class CommandLineInputs implements Inputs {

    private final String[] args;

    //Constructor of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;

    }

    //function of validating  email
    static boolean isEmailValid(String email){

        String regex ="^.+@.+$";
        return email.matches(regex);
    }


    //function of validating dates
    static boolean isDateValid(String date){

        String regex ="^[\\d]{4}-[\\d]{2}-[\\d]{2}$";
        return date.matches(regex);
    }


    public String getArguments() throws InvalidInputException{

        if (args.length != 4) {
            throw new InvalidInputException("Please provide the Report type, Start date of the report, End date of the report, output method (file/email), your email address ass  arguments. ");
        }

        String report_type = args[0];
        String start_date = args[1];
        String end_date = args[2];
        String output_method = args[3];
        String email_address = args[4];

        String[] validated_input = new String[5];

        //validate the type of report
        if (!(report_type.equals("monthly_sales") || report_type.equals("user_signups"))){
            throw new InvalidInputException("Please provide the type of report as monthly_sales or user_signups");
        }
        else{
            validated_input [0] = report_type;

        }

        //validate start date
        if(!isDateValid(start_date)){
            throw new InvalidInputException("Please enter start date of the report in yyyy-mm-dd format");
        }

        else{
            validated_input [1] = start_date;
        }

        //validate start date
        if(!isDateValid(end_date)){
            throw new InvalidInputException("Please enter end date of the report in yyyy-mm-dd format");
        }

        else{
            validated_input [2] = end_date;
        }

        // validate the output method
        if (!(output_method.equals("email") || output_method.equals("file"))){
            throw new InvalidInputException("Please provide out put method of the report as email or file");
        }
        else {
            validated_input [3] = output_method;
        }

        //validate email
        if(!isEmailValid(email_address)){
            throw new InvalidInputException("Please enter email address in ####@####.### format");
        }

        else{
            validated_input [4] = email_address;
        }
        return Arrays.toString(validated_input);
    }
}
