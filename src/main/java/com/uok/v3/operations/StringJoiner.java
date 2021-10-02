package readData.operations;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StringJoiner {

    ResultSet rs = null;

    public StringJoiner() {

    }

    public StringBuilder getInformationArray(ResultSet rs) throws SQLException {

        this.rs = rs;
        StringBuilder sb = new StringBuilder();

        while(rs.next()){
            sb.append(rs.getString("UserID"));
            sb.append(",");
            sb.append(rs.getString("Username"));
            sb.append(",");
            sb.append(rs.getString("User-Email"));
            sb.append(",");
            sb.append("\r\n");
        }

        return sb;
    }

}


