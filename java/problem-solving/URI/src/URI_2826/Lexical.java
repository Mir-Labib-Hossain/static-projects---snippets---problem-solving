package URI_2826;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lexical {

    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = new String[2];
        s[0] = br.readLine();
        s[1] = br.readLine();
        Arrays.sort(s);
        System.out.println(s[0]);
        System.out.println(s[1]);
    }
}
