package URI_2630;

import java.util.Arrays;
import java.util.Scanner;

public class GreyScale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j;
        int n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            scanner.nextLine();
            String s = scanner.nextLine();
            double[] rgb = new double[3];
            for (j = 0; j < 3; j++) {
                rgb[j] = scanner.nextDouble();
            }
            System.out.print("Caso #" + (i + 1) + ": ");
            if (s.equals("eye")) {
                System.out.println((int)(((rgb[0] * 30) / 100) + ((rgb[1] * 59) / 100) + ((rgb[2] * 11) / 100)));
            } else if (s.equals("mean")) {
                System.out.println((int)((rgb[0] + rgb[1] + rgb[2]) / 3));
            } else {
                Arrays.sort(rgb);
                if (s.equals("min")) {
                    System.out.println((int)rgb[0]);
                } else if (s.equals("max")) {
                    System.out.println((int)rgb[2]);
                }
            }
        }
    }
}
