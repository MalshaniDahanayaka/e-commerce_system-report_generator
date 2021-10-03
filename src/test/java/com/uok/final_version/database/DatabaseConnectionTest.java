package com.uok.final_version.database;

import org.junit.Test;

import java.sql.Connection;
import static org.junit.Assert.*;

public class DatabaseConnectionTest {

    //test connection that should not equal to null
    @Test
    public void test_get_connection() {

        Connection con = DatabaseConnection.getDatabaseConnection();
        assertEquals(con != null, true);


    }
}