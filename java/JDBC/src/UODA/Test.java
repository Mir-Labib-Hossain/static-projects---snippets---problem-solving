package UODA;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://127.0.0.1/cse?autoReconnect=true&useSSL=false";
        String use = "root";
        String pas = "labib";
        String query = "select * from `studebt`";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,use,pas);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while(rs.next())
        {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("phone"));
            System.out.println(rs.getString("address"));
            System.out.println(rs.getString("department"));
        }
        statement.close();
        connection.close();
    }
}