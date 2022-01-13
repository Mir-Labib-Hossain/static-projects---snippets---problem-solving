package URI_2791;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bean {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        int arr[] = new int[4];
        String s[] = br.readLine().split(" ");
        for(i=0; i<4; i++)
        {
            if(s[i].equals("1"))
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}
