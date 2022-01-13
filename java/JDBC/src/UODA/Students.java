package UODA;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Students {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        System.out.println("Connecting . . .");
        Scanner scanner = new Scanner(System.in);
        String url = "jdbc:mysql://127.0.0.1/uoda?autoReconnect=true&useSSL=false";
        String userName = "root";
        String password = "labib";
        String query;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection)DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();
        PreparedStatement pst;
        System.out.println("Connected !");
        
        System.out.println("Enter 1 : VIEW");
        System.out.println("Enter 2 : INSERT");
        System.out.println("Enter 3 : UPDATE");
        System.out.println("Enter 4 : DELETE");
        int input = scanner.nextInt();
        System.out.println("///////////////////////////////////////////////////");
        
        if(input == 1)
        {
            System.out.println("Enter 1 : View All Data");
            System.out.println("or");
            System.out.print("Enter ID :");
            int id = scanner.nextInt();
            System.out.println("///////////////////////////////////////////////////");
            
            if(id == 1)
            {   
                query = "select * from `batch 49`";
                ResultSet res = st.executeQuery(query);
                while(res.next())
                {
                    String ans = res.getInt("ID") + "\t" + res.getString("Name") + "\t" + res.getString("CGPA");
                    System.out.println(ans);
                }
            }
            else
            {
                query = "select * from `batch 49` where id = " + id +"";
                ResultSet res = st.executeQuery(query);
                res.next();
                String ans = res.getInt("ID") + "\t" + res.getString("Name") + "\t" + res.getString("CGPA");
                System.out.println(ans);
            }
        }
        else if(input == 2)
        {
            query = "insert into `batch 49` values (?,?,?)";
            pst = con.prepareStatement(query);
            
            System.out.print("ID : ");
            int id = scanner.nextInt();
            pst.setInt(1,id);
            scanner.nextLine();
            
            System.out.print("Name : ");
            String name = scanner.nextLine();
            pst.setString(2,name);
            
            System.out.print("CGPA : ");
            String cgpa = scanner.nextLine();
            pst.setString(3,cgpa);
            
            System.out.println(pst.executeUpdate()+" Rows added !");
            pst.close();
        }
        else if(input == 3)
        {
            System.out.print("Enter ID : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter ID or Name or CGPA to update : ");
            String set = scanner.nextLine();
            if(set.charAt(0) <='z' && set.charAt(0) >= 'A')
            {
                query = "update `batch 49` set Name = "+ set +" where ID = "+ id +"";
            }
            else if (set.charAt(1) == '.')
            {
                query = "update `batch 49` set CGPA = "+ set +" where ID = "+ id +"";
            }
            else
            {
                query = "update `batch 49` set ID = "+ set +" where ID = "+ id +"";
            }
            try{
            st.executeUpdate(query);
            }
            catch(Exception e)
            {
                System.out.println("Name Update ERROR !");
            }
        }
        else if(input == 4)
        {
            System.out.println("Enter ID :");
            int id = scanner.nextInt();
            query = "delete from `batch 49` where ID = "+ id +"";            
            st.executeUpdate(query);
            System.out.println("Deleted ID : "+id);
        }
        st.close();
        con.close();
        System.out.println("///////////////////////////////////////////////////");
    }
}
