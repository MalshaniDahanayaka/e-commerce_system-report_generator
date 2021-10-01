package com.uok.v1;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {

        try {
            PrintWriter pw= new PrintWriter(new File("D:\\csv\\users_table.csv"));
            StringBuilder sb=new StringBuilder();


            Connection connection=null;
            DatabaseConnector obj_DB_Connection=new DatabaseConnector();
            connection=obj_DB_Connection.getConnection();
            ResultSet rs=null;

            String query="select * from users";
            PreparedStatement ps= connection.prepareStatement(query);
            rs=ps.executeQuery();

            while(rs.next()){
                sb.append(rs.getString("userid"));
                sb.append(",");
                sb.append(rs.getString("username"));
                sb.append(",");
                sb.append("\r\n");
            }

            pw.write(sb.toString());
            pw.close();
            System.out.println("finished");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}