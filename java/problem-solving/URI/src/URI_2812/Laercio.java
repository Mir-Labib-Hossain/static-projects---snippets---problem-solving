package URI_2812;

import java.util.Arrays;
import java.util.Scanner;

public class Laercio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, k, min, max, n, test;
        test = scanner.nextInt();
        for (i = 0; i < test; i++) {
            n = scanner.nextInt();
            k = 0;
            int arr[] = new int[n];
            for (j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                if (arr[j] % 2 != 0) {
                    k++;
                } else {
                    arr[j] = 1001;
                }
            }
            Arrays.sort(arr);
            min = 0;
            max = k - 1;
            if (k != 0) {
                System.out.print(arr[max--]);
            }
            for (j = 1; j < k; j++) {
                if (j % 2 != 0) {
                    System.out.print(" " + arr[min++]);
                } else {
                    System.out.print(" " + arr[max--]);
                }
            }
            System.out.println();
        }
    }
}
