package com.uok.final_version.operations;

import com.uok.final_version.database.DatabaseConnection;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserInformationTest {

    //test case
    @Test
    public void should_concatenate_user_information() throws SQLException {
        ResultSet resultSet;
        DatabaseConnection objDBConnection = new DatabaseConnection();
        Connection connection = objDBConnection.getDatabaseConnection();

        String query = "select * from user_signup";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();



        StringBuilder result = new UserInformation(resultSet).getUserInformation();

        assertEquals(result != null, true);
    }
}