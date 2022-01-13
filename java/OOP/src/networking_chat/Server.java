package networking_chat;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Server{
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1201);
    Socket s = ss.accept();
    
    DataInputStream dI = new DataInputStream(s.getInputStream());
    DataOutputStream dO = new DataOutputStream(s.getOutputStream());
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String strin = "",strout="";
    
    System.out.print("ENTER USER NAME :");
    String name = new Scanner (System.in).nextLine();
        
    dO.writeUTF(name);
    String name2 = dI.readUTF();    
    
    while(!strin.equals("bye"))
    {
        strin = dI.readUTF();
        System.out.println(name2+" :  "+strin);
        
        strout = br.readLine();
        dO.writeUTF(strout);
        
        dO.flush();
    }
    dI.close();
    s.close();
    ss.close();
}
}