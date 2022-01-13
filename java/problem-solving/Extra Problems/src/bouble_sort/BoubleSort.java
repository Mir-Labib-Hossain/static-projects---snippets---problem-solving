package bouble_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class BoubleSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Mir Labib Hossain(011183007)\nEnter array length : ");
        int i, j, temp, n = Integer.parseInt(br.readLine());
        System.out.print("Enter " + n + " number : ");
        String s[] = br.readLine().split(" ");
        int[] arr = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array :");
        for (i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
