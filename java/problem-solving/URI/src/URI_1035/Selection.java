package URI_1035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Selection {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d;
        String s[] = br.readLine().split(" ");
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
        c = Integer.parseInt(s[2]);
        d = Integer.parseInt(s[3]);
        if (b > c && d > a && (c + d) > (a + b) && d >= 0 && c > 0 && (a % 2) == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
