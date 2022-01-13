package Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Insert {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password = "labib";
        String query = "insert into `batch 49` values (11183032,'Choyon Islam*','3.85')";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        query = "select * from `batch 49`";
        ResultSet res = statement.executeQuery(query);
        while(res.next())
        {
            System.out.println(res.getInt("ID")+"\t"+res.getString("Name")+"\t"+res.getString("CGPA"));
        }
        statement.close();
        connection.close();
    }
}