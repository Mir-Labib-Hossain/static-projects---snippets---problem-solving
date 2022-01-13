package URI_2727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n, i, ascii;
        while((str=input.readLine())!=null && str.length()!=0) {
            n = Integer.parseInt(str.trim());
            for (i = 0; i < n; i++) {
                ascii = 93;
                String s[] = input.readLine().split(" ");
                ascii += 3;
                if (s.length == 1) {
                    System.out.println((char) (s[0].length() + ascii));
                    continue;
                }
                ascii += 3;
                if (s.length == 2) {
                    System.out.println((char) (s[0].length() + ascii));
                    continue;
                }
                ascii += 3;
                if (s.length == 3) {
                    System.out.println((char) (s[0].length() + ascii));
                    continue;

                }
                ascii += 3;
                if (s.length == 4) {
                    System.out.println((char) (s[0].length() + ascii));
                    continue;
                }
                ascii += 3;
                if (s.length == 5) {
                    System.out.println((char) (s[0].length() + ascii));
                    continue;
                }
                ascii += 3;
                if (s.length == 6) {
                    System.out.println((char) (s[0].length() + ascii));
                    continue;
                }
                ascii += 3;
                if (s.length == 7) {
                    System.out.println((char) (s[0].length() + ascii));
                    continue;
                }
                ascii += 3;
                if (s.length == 8) {
                    System.out.println((char) (s[0].length() + ascii));
                    continue;
                }
                ascii += 3;
                if (s.length == 9) {
                    System.out.println((char) (s[0].length() + ascii));
                }
            }
        }
    }
}
