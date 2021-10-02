package com.uok.v3.operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringJoinerTest {

    //test case
    @Test
    public void stringBuilderAppendShouldConcatenate()  {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("String");
        stringBuilder.append("Builder");
        stringBuilder.append("Test");

        assertEquals("StringBuilderTest", stringBuilder.toString());
    }


}