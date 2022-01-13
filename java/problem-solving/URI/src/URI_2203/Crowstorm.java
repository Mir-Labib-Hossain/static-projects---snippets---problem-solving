package URI_2203;

import java.util.Scanner;

public class Crowstorm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Xf, Yf, Xi, Yi, Vi, R1, R2;
        while (scanner.hasNext()) {
            Xf = scanner.nextDouble();
            Yf = scanner.nextDouble();
            Xi = scanner.nextDouble();
            Yi = scanner.nextDouble();
            Vi = scanner.nextDouble();
            R1 = scanner.nextDouble();
            R2 = scanner.nextDouble();
            System.out.println(((R1 + R2) >= (Math.sqrt(Math.pow((Xf - Xi), 2) + Math.pow((Yf - Yi), 2)) + (1.5 * Vi))) ? "Y" : "N");
        }
    }
}
