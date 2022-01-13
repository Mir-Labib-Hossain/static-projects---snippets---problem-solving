package Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class aaTEST {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String name = "root";
        String pass = "labib";
        String query = "Select sum(cgpa),cgpa, count(id) as counter  from `batch 49` group by cgpa order by cgpa desc";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, name, pass);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next())
            System.out.println(result.getString(1)+"\t"+result.getString("CGPA")+"\t"+result.getString("counter"));
        connection.close();
        statement.close();
    }
}