package com.uok.v3.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase{
    public Connection getConnection(){

        try {

            String url="jdbc:mysql://localhost:3306/ecommerce_system_database";
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