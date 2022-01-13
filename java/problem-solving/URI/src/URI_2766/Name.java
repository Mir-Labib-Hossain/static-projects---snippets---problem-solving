package URI_2766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String s[] = new String[10];
        for (i = 0; i < 10; i++) {
            s[i] = br.readLine();
        }
        System.out.println(s[2]);
        System.out.println(s[6]);
        System.out.println(s[8]);
    }
}