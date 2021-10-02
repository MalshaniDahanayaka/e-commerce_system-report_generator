package readData.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataRepository {

        ResultSet GetSqlDataForReport() throws DataRepositoryException, SQLException;


}
