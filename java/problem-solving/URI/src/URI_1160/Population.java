package URI_1160;

import java.util.Scanner;

public class Population {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int A, B, i, ans;
        double g1, g2;
        for (i = 0; i < n; i++) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            g1 = scanner.nextDouble();
            g2 = scanner.nextDouble();
            ans = 0;
            while (true) {
                A = (int) (A + (A * g1) / 100);
                B = (int) (B + (B * g2) / 100);
                ans++;
                if (ans > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
                else if (A > B) {
                    System.out.println(ans + " anos.");
                    break;
                }
            }
        }
    }
}