package Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password = "labib";
        String query = "create table Info (No Int, ID varchar(250), Phone varchar(250), Location varchar(250))";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        connection.close();
        statement.close();
    }
    
}
