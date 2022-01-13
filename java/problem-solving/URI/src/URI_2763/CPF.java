package URI_2763;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CPF {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("\\.");
        System.out.println(s[0]);
        System.out.println(s[1]);
        String s2[] = s[2].split("-");
        System.out.println(s2[0]);
        System.out.println(s2[1]);
    }
}
