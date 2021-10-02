package com.uok.v2;


import java.sql.ResultSet;
import java.sql.SQLException;

public class StringJoiner {

    public void concatenateString(ResultSet rs) throws SQLException {
        StringBuilder sb=new StringBuilder();

        while(rs.next()){
            sb.append(rs.getString("id"));
            sb.append(",");
            sb.append(rs.getString("name"));
            sb.append(",");
            sb.append(rs.getString("price"));
            sb.append(",");
            sb.append("\r\n");
        }
    }



}
