package Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Like {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password = "labib";
        
        //String query = "select * from `batch 49` where name like'%labib%'"; //find labib in middle or any where
        String query = "select * from `batch 49` where name like '%l%b%'";  //find a word from any where that starts with l and ends with b
        
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