package com.uok.final_version.input;


public class CommandLineInputs implements Inputs {

    final String[] args;

    //Constructor of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;

    }


    public String[] getArguments() throws InvalidInputException {

        if (args.length != 5) {
            throw new InvalidInputException("Please provide the Report type, Start date of the report, End date of the report, output method (file/email), your email address ass  arguments. ");
        }

        String report_type = args[0];
        String output_method = args[3];
        String[] validated_input = new String[5];


        //validate the type of report
        if (!(report_type.equals("monthly_sales") || report_type.equals("user_signup"))) {
            throw new InvalidInputException("Please provide the type of report as monthly_sales or user_signups");
        } else {
            validated_input[0] = report_type;

        }


/       //start and end date validation
        try {
            DateValidation getValidStartDate = new DateValidation(args[1]);
            String start_date = getValidStartDate.getValidatedDate();
            validated_input[1] = start_date;

            DateValidation getValidEndDateDate = new DateValidation(args[2]);
            String end_date = getValidEndDateDate.getValidatedDate();
            validated_input[2] = end_date;

        } catch (InvalidInputException e) {
            throw new InvalidInputException("Please provide valid date for arguments in YYYY-MM-DD format");
        }


        // validate the output method
        if (!(output_method.equals("email") || output_method.equals("file"))) {
            throw new InvalidInputException("Please provide out put method of the report as email or file");
        } else {
            validated_input[3] = output_method;
        }


/        //Email validation function
        try {
            EmailValidation getValidatedEmail = new EmailValidation(args[4]);
            String validatedEmail = getValidatedEmail.getValidatedEmail();
            validated_input[4] = validatedEmail;
        } catch (InvalidInputException e) {
            throw new InvalidInputException("Please provide valid Email in #@#.# format");
        }


        return validated_input;
    }


}