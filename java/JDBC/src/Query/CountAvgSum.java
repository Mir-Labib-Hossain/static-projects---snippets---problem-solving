package Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountAvgSum {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password = "labib";
        //String query = "select count(cgpa) from `batch 49`";
        //String query = "select avg(cgpa) from `batch 49`";
        String query = "select sum(cgpa) from `batch 49`";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        result.next();
        System.out.println(result.getString(1));
        connection.close();
        statement.close();
    }
}
