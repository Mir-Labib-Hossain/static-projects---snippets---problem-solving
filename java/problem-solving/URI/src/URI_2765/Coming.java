package URI_2765;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coming {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(",",2);
        System.out.println(s[0]);
        System.out.println(s[1]);
    }
}
