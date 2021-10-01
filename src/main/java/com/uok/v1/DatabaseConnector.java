package com.uok;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    public Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connector","root", "");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
