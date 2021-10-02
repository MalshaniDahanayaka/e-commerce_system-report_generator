package com.uok.v3.repository;


import com.uok.v3.database.ConnectionDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlDataRepository implements DataRepository{

        String filetype ;
        String startDate;
        String endDate;
        public SqlDataRepository(String filetype,String startDate,String endDate){
            this.filetype = filetype;

            this.startDate = startDate;

            this.endDate = endDate;



        }

        public ResultSet GetSqlDataForReport() throws  SQLException {

            ConnectionDatabase objDBConnection = new  ConnectionDatabase();
            Connection connection = objDBConnection.getConnection();
            String query = "select * from " + filetype;
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;


        }


}


