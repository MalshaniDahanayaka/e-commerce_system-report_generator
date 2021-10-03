package com.uok.final_version.input;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandLineInputsTest {

    @Test
    public void should_get_command_line_inputs() throws InvalidInputException {
        String[] args = {"monthly_sales", "2021-09-01", "2021-09-26", "file", "skasunmk98@gmail.com"};
        CommandLineInputs commandLineInputs = new CommandLineInputs(args);
        String[] result = commandLineInputs.getArguments();
        assertEquals(result,args);



    }

}