package Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Advance {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password = "labib";
        //String query = "SELECT * FROM `batch 49` WHERE cgpa between '3.50' and '4.00' AND name like '%mir%' AND id in ('11183006')";
        String query = "SELECT * FROM `batch 49` WHERE name between 'Mir Labib Hossain' and 'Shahadat Hossain' order by cgpa";
        //String query = "select info.location, `batch 49`.name from info,`batch 49` where `batch 49`.id = 11183007 and info.id=11183007";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next())
            //System.out.println(result.getString("Location")+"\t"+result.getString("Name"));
            System.out.println(result.getInt("ID")+"\t"+result.getString("Name")+"\t"+result.getString("CGPA"));
        statement.close();
        connection.close();
    }
}