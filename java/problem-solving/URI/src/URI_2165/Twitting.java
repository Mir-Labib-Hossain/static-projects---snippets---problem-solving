package URI_2165;
import java.io.*;
public class Twitting {
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String s = br.readLine();
        if(s.length()>140)
            System.out.println("MUTE");
        else
            System.out.println("TWEET");
    }
    
}
