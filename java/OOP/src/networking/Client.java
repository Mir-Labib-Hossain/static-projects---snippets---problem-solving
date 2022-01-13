package networking;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.0.104",1201);
        
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
            strin = br.readLine();
            dO.writeUTF(strin);
            dO.flush();
            
            strout = dI.readUTF();
            System.out.println(name2+" : "+strout);
        }
        dO.close();
        s.close();

    }
}
