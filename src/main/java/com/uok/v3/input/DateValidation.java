package com.uok.v3.input;

public class DateValidation {

    String date ;
    public DateValidation(String date){
     this.date = date;

    }


    public String getValidatedDate() throws InvalidInputException {

        if(!isDateValid(date)){
            throw new InvalidInputException("Please enter  Date  in YYYY-MM-TT format");
        }

        else{
            return date;
        }

    }




    //function of validating dates
    static boolean isDateValid(String date){

        String regex ="^[\\d]{4}-[\\d]{2}-[\\d]{2}$";
        return date.matches(regex);
    }
}
