package com.uok.final_version.repository;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class SqlDataRepositoryTest {

    @Test
    public void should_get_data_from_database() throws SQLException {
        SqlDataRepository sqlDataRepository = new SqlDataRepository("monthly_sales","2021-09-01","2021-09-26");
        ResultSet result = sqlDataRepository.GetSqlDataForReport();
        assertEquals(result != null,true);


    }

}