package Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectDistinct {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String username = "root";
        String password = "labib";
        String query = "select distinct cgpa from `batch 49`";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next())
            System.out.println(result.getString("CGPA"));
        query = "SELECT COUNT(DISTINCT CGPA) FROM `batch 49`";
        result = statement.executeQuery(query);
        result.next();
        System.out.println("Number of different CGPA = "+result.getInt(1));
        connection.close();
        statement.close();
    }
    
}
