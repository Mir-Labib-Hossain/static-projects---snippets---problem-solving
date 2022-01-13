package URI_1541;

import java.util.Scanner;

public class Building {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        while (true) {
            a = scanner.nextInt();
            if (a == 0) {
                System.exit(0);
            }
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (c == 100) {
                System.out.println((int) Math.sqrt(a * b));
            } else {
                System.out.println((int) Math.sqrt(((a * b) / ((a * b) * (c / 100.0))) * (a * b)));
            }
        }
    }
}
