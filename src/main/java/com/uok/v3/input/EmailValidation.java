package com.uok.v3.input;

public class EmailValidation {

    public String email ;
    public EmailValidation(String email){
        this.email = email;
    }


    public String getValidatedEmail() throws InvalidInputException {
        //validate email
        if(!isEmailValid(email)){
            throw new InvalidInputException("Please enter email address in ####@####.### format");
        }

        else{
            return email;
        }

    }

    //function of validating  email
    static boolean isEmailValid(String email){

        String regex ="^.+@.+$";
        return email.matches(regex);
    }

}
