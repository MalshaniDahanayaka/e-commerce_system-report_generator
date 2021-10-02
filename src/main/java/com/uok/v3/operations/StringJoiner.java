package readData.operations;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StringJoiner {

    ResultSet rs = null;

    public StringJoiner() {

    }

    public StringBuilder getUserInformationArray(ResultSet rs) throws SQLException {

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


    public StringBuilder getSalesInformationArray(ResultSet rs) throws SQLException {

        this.rs = rs;
        StringBuilder sb = new StringBuilder();

        while(rs.next()){
            sb.append(rs.getString("Product_ID"));
            sb.append(",");
            sb.append(rs.getString("Product_Name"));
            sb.append(",");
            sb.append(rs.getString("Product_Price"));
            sb.append(",");
            sb.append(rs.getString("Number_of_purchases"));
            sb.append(",");
            sb.append("\r\n");
        }

        return sb;
    }

}
