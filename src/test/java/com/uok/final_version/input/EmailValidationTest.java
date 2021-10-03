package com.uok.final_version.input;


import org.junit.Test;


import static org.junit.Assert.*;

public class EmailValidationTest {

    @Test
    public void should_check_email_format() throws InvalidInputException {
        EmailValidation emailValidation = new EmailValidation("johnsmith@gmail.com");
        String result = emailValidation.getValidatedEmail();
        assertEquals(result,"johnsmith@gmail.com");



    }


}