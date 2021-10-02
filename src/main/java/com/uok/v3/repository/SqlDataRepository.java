package readData.repository;

import readData.database.ConnectionDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlDataRepository implements DataRepository{

        String filetype ;
        public SqlDataRepository(String filetype){
            this.filetype = filetype;

        }

        public ResultSet GetSqlDataForReport() throws DataRepositoryException, SQLException {

            ConnectionDatabase objDBConnection = new  ConnectionDatabase();
            Connection connection = objDBConnection.getConnection();
            String query = "select * from " + filetype;
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;


        }


}


