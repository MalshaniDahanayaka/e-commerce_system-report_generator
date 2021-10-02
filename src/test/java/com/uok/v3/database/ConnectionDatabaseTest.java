package com.uok.v3.database;

import org.junit.Test;

import java.sql.Connection;
import static org.junit.Assert.*;

public class ConnectionDatabaseTest {

    //test connection that should not equal to null
    @Test
    public void test_get_connection() {

        Connection con = ConnectionDatabase.getConnection();
        assertEquals(con != null, true);


    }
}