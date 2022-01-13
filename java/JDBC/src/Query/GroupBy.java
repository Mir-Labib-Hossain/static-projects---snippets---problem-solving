package Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class GroupBy {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password = "labib";
        //String query = "select count(name),cgpa from `batch 49` group by cgpa order by cgpa";
        String query = "select count(`batch 49`.id), info.location from `batch 49`,info where `batch 49`.id=info.id group by location";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next())
            System.out.println(result.getString(1)+"\t"+result.getString("Location"));
            //System.out.println(result.getInt("ID")+"\t"+result.getString("Name")+"\t"+result.getString("CGPA"));
        statement.close();
        connection.close();
    }
}