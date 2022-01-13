package URI_2760;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringIO {

    static void check(String s) {
        if (s.length() < 10) {
            System.out.print(s);
        } else {
            System.out.print(s.substring(0, 10));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        System.out.println(a + "" + b + "" + c);
        System.out.println(b + "" + c + "" + a);
        System.out.println(c + "" + a + "" + b);
        check(a);
        check(b);
        check(c);
        System.out.println("");
    }
}
