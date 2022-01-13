package URI_2029;

import java.util.Scanner;

public class Honey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h, a, v, d;
        double n = 3.14;
        while (scanner.hasNext()) {
            v = scanner.nextDouble();
            d = scanner.nextDouble();
            h = Math.pow((2 * (Math.sqrt(v)) / (Math.sqrt(n) * d)), 2);
            a = n * Math.pow(Math.sqrt(v / (n * h)), 2);
            System.out.printf("ALTURA = %.2f\n", h);
            System.out.printf("AREA = %.2f\n", a);
        }
    }
}
