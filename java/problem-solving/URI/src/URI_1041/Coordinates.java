package URI_1041;

import java.util.Scanner;

public class Coordinates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a =scanner.nextDouble();
        double b =scanner.nextDouble();
        if ((a == 0.0) && b == 0.0) {
            System.out.println("Origem");
        } else if (a == 0 ) {
            System.out.println("Eixo Y");
        } else if (b == 0 ) {
            System.out.println("Eixo X");
        } else if ((a > 0) && (b > 0)) {
            System.out.println("Q1");
        } else if ((a < 0) && (b > 0)) {
            System.out.println("Q2");
        } else if ((a < 0) && (b < 0)) {
            System.out.println("Q3");
        } else if ((a > 0) && (b < 0)) {
            System.out.println("Q4");
        }
    }
}
