package URI_2334;

import java.math.BigInteger;
import java.util.Scanner;

public class Duck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        BigInteger n;
        BigInteger m = new BigInteger("1");
        while (true) {
            s = scanner.nextLine();
            switch (s) {
                case "-1":
                    System.exit(0);
                case "0":
                    System.out.println("0");
                    break;
                default:
                    n = new BigInteger(s);
                    System.out.println(n.subtract(m));
                    break;
            }
        }
    }
}
