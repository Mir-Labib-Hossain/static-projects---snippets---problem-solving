package Query;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class Between {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password="labib";
        
        String query = "select * from `batch 49` where CGPA between '3.50' and '4.00'";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next())
            System.out.println(result.getInt("ID")+"\t"+result.getString("Name")+"\t"+result.getString("CGPA"));
        statement.close();
        connection.close();
    }
}
