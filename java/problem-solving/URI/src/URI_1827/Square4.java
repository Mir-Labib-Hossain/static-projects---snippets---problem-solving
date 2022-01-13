package URI_1827;

import java.util.Scanner;

public class Square4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, n;
        double max, min;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            max = Math.round(n * (70 / 100.0));
            min = Math.round(n * (30 / 100.0));
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (i == n / 2 && j == n / 2) {
                        System.out.print("4");
                    } else if (i>=n/3 && i<n-n/3 && j>=n/3 && j<n-n/3) {
                        System.out.print("1");
                    } else if (i == j) {
                        System.out.print("2");
                    } else if (i + j == n - 1) {
                        System.out.print("3");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
