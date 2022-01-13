package uoda_contest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Between_the_citys {
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        s = br.readLine();
       
        if(s.charAt(0)=='S')
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
