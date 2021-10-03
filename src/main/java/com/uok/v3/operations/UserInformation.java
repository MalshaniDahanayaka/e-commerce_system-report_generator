package com.uok.v3.operations;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInformation {

    ResultSet resultSet;
    public UserInformation(ResultSet rs){
        this.resultSet = rs;
    }

    public StringBuilder getUserInformation() throws SQLException {

        StringBuilder sb = new StringBuilder();

        while(resultSet.next()){
            sb.append(resultSet.getString("UserID"));
            sb.append(",");
            sb.append(resultSet.getString("Username"));
            sb.append(",");
            sb.append(resultSet.getString("User-Email"));
            sb.append(",");
            sb.append("\r\n");
        }

        return sb;

    }
}
