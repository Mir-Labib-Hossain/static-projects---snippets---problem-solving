package URI_2802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Circle {
    static BigInteger factorial(int n) {
        int i;
        BigInteger fact = new BigInteger("1");
        for (i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        BigInteger factorialN = factorial(n);   
        BigInteger nCr4 = factorialN.divide(factorial(n - 4).multiply(factorial(4)));
        BigInteger nCr2 = factorialN.divide(factorial(n - 2).multiply(factorial(2)));
        System.out.println(nCr4.add(nCr2.add(BigInteger.valueOf(1))));
    }
}