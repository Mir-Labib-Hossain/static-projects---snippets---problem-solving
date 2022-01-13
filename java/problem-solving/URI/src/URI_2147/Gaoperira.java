package URI_2147;
import java.io.*;
public class Gaoperira {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        String a = br.readLine();
        String b;
        int c = Integer.parseInt(a);
        for(int i=0; i<c; i++)
        {
            b = br.readLine();
            System.out.println(String.format("%.2f",(double)b.length()/100));
        }
    }   
}
