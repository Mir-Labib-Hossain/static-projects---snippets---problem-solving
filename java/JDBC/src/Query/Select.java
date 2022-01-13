package Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Select {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password = "labib";
        //String query = "select * from `batch 49` where cgpa = '4.00'";
        //String query = "select * from `batch 49` where cgpa <> '4.00'"; //not equal
        //String query = "select * from `batch 49` where cgpa in ('3.50','4.00')";
        //String query = "select * from `batch 49` where not cgpa = '4.00'";
        //String query = "select * from `batch 49` where cgpa is null";
        String query = "select * from `batch 49` where cgpa is not null";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next())
            System.out.println(result.getInt("ID")+"\t"+result.getString("Name")+"\t"+result.getString("CGPA"));        
        statement.close();
        connection.close();
    }
}