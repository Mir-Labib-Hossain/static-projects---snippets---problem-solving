package Query;
import java.sql.*;
public class In {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password = "labib";
        
        //String query = "select name from `batch 49` where cgpa in ('4.00', '3.50')";
        String query = "select name from `batch 49` where cgpa not in ('4.00', '3.50')";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next())
        {
            System.out.println(result.getString("Name"));
        }
        connection.close();
        statement.close();
    }
}
