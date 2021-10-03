package com.uok.v3.operations;

import java.sql.SQLException;

public interface Operation {
        StringBuilder getSalesInformation() throws InvalidReportSenderAppOperationException, SQLException;
}
