package Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Join {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1/uoda";
        String userName = "root";
        String password = "labib";
        
        //String query = "select * from info inner join `batch 49` on `batch 49`.ID = info.ID order by `batch 49`.id";
        String query = "select * from info, `batch 49` where `batch 49`.ID = info.ID order by `batch 49`.id";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next())        
            System.out.println(result.getInt("ID")+"\t"+result.getString("Name")+"\t"+result.getString("Location"));        
        statement.close();
        connection.close();
        
    }
    
}
