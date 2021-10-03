package com.uok.final_version.operations;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInformation {

    ResultSet resultSet;
    public UserInformation(ResultSet rs){
        this.resultSet = rs;
    }

    public StringBuilder getUserInformation() throws SQLException {

        StringBuilder stringBuilder = new StringBuilder();

        while(resultSet.next()){
            stringBuilder.append(resultSet.getString("UserID"));
            stringBuilder.append(",");
            stringBuilder.append(resultSet.getString("Username"));
            stringBuilder.append(",");
            stringBuilder.append(resultSet.getString("User-Email"));
            stringBuilder.append(",");
            stringBuilder.append(resultSet.getString("date"));
            stringBuilder.append(",");
            stringBuilder.append("\r\n");
        }

        return stringBuilder;

    }
}
