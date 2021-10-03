package com.uok.v3.operations;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesInformation implements Operation{

    ResultSet resultSet;
    public SalesInformation(ResultSet rs){
        this.resultSet = rs;
    }

    public StringBuilder getSalesInformation() throws SQLException {

        StringBuilder stringBuilder = new StringBuilder();

        while(resultSet.next()){
            stringBuilder.append(resultSet.getString("Product_ID"));
            stringBuilder.append(",");
            stringBuilder.append(resultSet.getString("Product_Name"));
            stringBuilder.append(",");
            stringBuilder.append(resultSet.getString("Product_Price"));
            stringBuilder.append(",");
            stringBuilder.append(resultSet.getString("Number_of_purchases"));
            stringBuilder.append(",");
            stringBuilder.append(resultSet.getString("date"));
            stringBuilder.append(",");
            stringBuilder.append("\r\n");
        }

        return stringBuilder;

    }
}
