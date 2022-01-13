package factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i;
        System.out.println("Enter a number : ");
        n = scanner.nextInt();
        BigInteger f = new BigInteger("1");
        for (i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + n + " is " + f);

    }
}
