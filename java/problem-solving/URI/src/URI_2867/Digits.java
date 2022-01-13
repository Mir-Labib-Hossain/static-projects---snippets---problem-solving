package URI_2867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Digits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, test = Integer.parseInt(br.readLine());
        for (i = 0; i < test; i++) {
            String s[] = br.readLine().split(" ");
            BigInteger a = new BigInteger(s[0]);
            int b = Integer.parseInt(s[1]);
            System.out.println(String.valueOf(a.pow(b)).length());
        }
    }
}
