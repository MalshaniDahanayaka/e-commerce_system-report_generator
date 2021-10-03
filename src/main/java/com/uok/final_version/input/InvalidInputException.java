package com.uok.final_version.input;

import java.io.IOException;

public class InvalidInputException extends Throwable {
    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(IOException e, String message) {
        super(message, e);
    }
}
