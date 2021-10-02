package com.uok.v1.inputs;

public class CommandLineInputs {

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

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide the arguments. ");
        }

        String type = args[0];
        String start_date = args[1];
        String end_date = args[2];
        String output_method = args[3];
        String email_address = args[4];

        String[] validated_input = new String[5];

        //validate the type of report
        if (!(type.equals("monthly_sales") || type.equals("user_signup"))){
            System.out.println("please provide type of report as monthly_sales or user_signup");
        }
        else{
            validated_input [0] = type;

        }

        //validate start date
        if(isDateValid(start_date)== false){
            System.out.println("Please enter start date in correct format yyyy-mm-dd ");
        }

        else{
            validated_input [1] = start_date;
        }

        //validate start date
        if(isDateValid(end_date)== false){
            System.out.println("Please enter end date in correct format yyyy-mm-dd ");
        }

        else{
            validated_input [2] = end_date;
        }

        // validate the output method
        if (!(output_method.equals("email") || output_method.equals("file"))){
            System.out.println("please provide out put method 'email' or 'file' ");
        }
        else {
            validated_input [3] = output_method;
        }

        //validate email
        if(isEmailValid(email_address)== false){
            System.out.println("Please enter end date in correct format ex:- joe123@gmail ");
        }

        else{
            validated_input [4] = email_address;
        }

    }
}
