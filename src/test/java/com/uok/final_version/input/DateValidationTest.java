package com.uok.final_version.input;

import org.junit.Test;

import static org.junit.Assert.*;

   public class DateValidationTest {
        @Test
        public void should_check_date_format() throws InvalidInputException {
            DateValidation dateValidation = new DateValidation("2020-10-23");
            String result = dateValidation.getValidatedDate();
            assertEquals(result,"2020-10-23");



    }

}