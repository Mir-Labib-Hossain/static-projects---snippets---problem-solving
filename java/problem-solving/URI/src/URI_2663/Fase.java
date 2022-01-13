package URI_2663;

import java.util.Scanner;
import java.util.Arrays;

public class Fase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int arr[] = new int[n];
        int i, x, count = 0;
        try {
            for (i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            x = n - 1;
            while (true) {
                for (i = 0; i < n; i++) {
                    if (arr[x] == arr[x - i]) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count >= k) {
                    break;
                }
                x = x - i;
            }
        } catch (Exception e) {
        }
        System.out.println(count);
    }
}
