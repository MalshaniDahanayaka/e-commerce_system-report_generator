package com.uok.final_version.repository;

import com.uok.final_version.operations.InvalidReportSenderAppOperationException;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataRepository {

        ResultSet GetSqlDataForReport() throws DataRepositoryException, SQLException, InvalidReportSenderAppOperationException;


}
