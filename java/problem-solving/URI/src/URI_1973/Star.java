package URI_1973;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a[] = new int[num];
        int b[] = new int[num];
        int i;
        long sum = 0;
        int count = 0;
        for (i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }
        i = 0;
        while (true) {
            if (i == num || a[i] == 0) {
                break;
            } else if ((a[i] % 2 == 0)) {
                a[i]--;
                b[i] = 1;
                if (i == 0) {
                    break;
                }
                i--;
            } else if (a[i] % 2 != 0) {
                a[i] --;
                b[i] = 1;
                i++;
            }
        }
        for (i = 0; i < num; i++) {
            if (b[i] == 1) {
                count++;
            }
            sum += a[i];
        }
        System.out.println(count + " " + sum);
    }
}