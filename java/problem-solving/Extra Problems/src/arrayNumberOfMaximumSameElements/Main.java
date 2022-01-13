package arrayNumberOfMaximumSameElements;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, max, ans = 0, test = scanner.nextInt();
        int arr[] = new int[test];
        for (i = 0; i < test; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        max = ans;
        for (i = 1; i < test; i++) {
            if (arr[i - 1] == arr[i]) {
                ans++;
            }
            if (max < ans) {
                max = ans;
            }
            if (arr[i - 1] != arr[i]) {
                ans = 0;
            }
        }
        System.out.println(test - (max + 1));
    }
}
