package URI_2783;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cup {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c, s, p, i, j, count=0;
        boolean b;
        String s1[] = br.readLine().split(" ");
        c = Integer.parseInt(s1[0]);
        s = Integer.parseInt(s1[1]);
        p = Integer.parseInt(s1[2]);
        String s2[] = br.readLine().split(" ");
        String s3[] = br.readLine().split(" ");
        for(i=0; i<s; i++){
            b = true;
            for(j=0; j<p; j++){
                if(s2[i].equals(s3[j]))
                    b = false;
            }
            if(b==true)
                count++;
        }
        System.out.println(count);
    }
}
