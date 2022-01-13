package CanYouSum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, sum = 0;
        n = scanner.nextInt();
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
