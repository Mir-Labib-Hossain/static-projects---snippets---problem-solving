package URI_3047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Monica {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int s1 = Integer.parseInt(br.readLine());
        int s2 = Integer.parseInt(br.readLine());
        int s3 = m - (s1 + s2);
        if(s1>s2 && s1>s3)
            System.out.println(s1);
        else if(s2>s1 && s2>s3)
            System.out.println(s2);
        else
            System.out.println(s3);
    }
}
