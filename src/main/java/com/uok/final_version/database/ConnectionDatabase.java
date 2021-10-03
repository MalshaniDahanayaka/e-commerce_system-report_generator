package com.uok.final_version.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase{
    public static Connection getConnection(){

        try {

            String url="jdbc:mysql://localhost:3308/e-commerce_system";
            String username="root";
            String password="";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection(url,username,password);
            return connection;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}