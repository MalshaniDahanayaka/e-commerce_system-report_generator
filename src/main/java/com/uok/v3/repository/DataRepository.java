package com.uok.v3.repository;

import com.uok.v3.operations.InvalidReportSenderAppOperationException;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataRepository {

        ResultSet GetSqlDataForReport() throws DataRepositoryException, SQLException, InvalidReportSenderAppOperationException;


}
