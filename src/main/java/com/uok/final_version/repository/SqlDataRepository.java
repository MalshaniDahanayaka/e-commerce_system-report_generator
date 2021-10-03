package com.uok.final_version.repository;

import com.uok.final_version.database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlDataRepository implements DataRepository{

        String filetype ;
        String startDate;
        String endDate;
        ResultSet resultSet;
        public SqlDataRepository(String filetype,String startDate,String endDate){
            this.filetype = filetype;
            this.startDate = startDate;
            this.endDate = endDate;
        }


        public ResultSet GetSqlDataForReport() throws  SQLException{

            DatabaseConnection objDBConnection = new DatabaseConnection();
            Connection connection = objDBConnection.getDatabaseConnection();

            String query = new StringBuilder().append("select * from ").append(filetype).append(" where date between '").append(startDate).append("' and '").append(endDate).append('\'').toString();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            return resultSet;


        }


}


