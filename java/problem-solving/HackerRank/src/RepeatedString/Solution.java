package RepeatedString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j = 0, sLen, a = 0;
        String s = br.readLine();
        sLen = s.length();
        BigInteger n = new BigInteger(br.readLine().trim());
        BigInteger i;
        String s2 = "";
        for (BigInteger bi = (new BigInteger("0")); bi.compareTo(n) < 0; bi = bi.add(BigInteger.ONE)) {
            s2 += s.charAt(j++);
            if (j == sLen) {
                j = 0;
            }
            if (s2.charAt(bi.intValue()) == 'a') {
                a++;
            }
        }
        System.out.println(a);
    }
}
