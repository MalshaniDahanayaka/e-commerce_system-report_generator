package com.uok.final_version.operations;

import java.sql.SQLException;

public interface Operation {
        StringBuilder getSalesInformation() throws InvalidReportSenderAppOperationException, SQLException;
}
