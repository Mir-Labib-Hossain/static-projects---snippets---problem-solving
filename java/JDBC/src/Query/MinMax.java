package Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MinMax {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String username = "root";
        String password = "labib";
        //String query = "SELECT MIN(CGPA) AS SmallestPrice FROM uoda.`batch 49`";
        String query = "select max(cgpa) as largestprice from `batch 49`";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        result.next();
        System.out.println(result.getString(1));
        connection.close();
        statement.close();
    }
    
}
