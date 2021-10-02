package com.uok.v3.operations;

public interface Operation {
        String execute(String[] argumentDetails) throws  InvalidReportSenderAppOperationException;
}
