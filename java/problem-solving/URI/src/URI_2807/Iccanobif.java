package URI_2807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iccanobif {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i, a, b, sum=1;
        n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];
        a = 1;
        b = 1;
        arr[0] = a;
        for (i = 0; i < n - 1; i++) {
            arr[i + 1] = sum;
            sum = a + b;
            b = a;
            a = sum;
        }
        for (i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[0]);
    }
}
