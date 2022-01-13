package URI_2718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Lights {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n, i, check=1, temp = 0, ans = 0;
        BigInteger x;
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        n = Integer.parseInt(input.readLine().trim());
        for (i = 0; i < n; i++) {
            x  = new BigInteger(input.readLine());
            while (check!=0) {
                check = x.compareTo(zero);
                if (x.remainder(two).equals(one)) {
                    temp++;
                } else {
                    temp = 0;
                }
                if (temp > ans) {
                    ans = temp;
                }
                x = x.divide(two);
            }
            System.out.println(ans);
            temp = 0;
            ans = 0;
            check = 1;
        }
    }
}
