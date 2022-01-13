package URI_2846;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonot {

    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, i, k, input = Integer.parseInt(br.readLine().trim());
        k = 0;
        a = 0;
        b = 1;
        int arr[] = new int[input];
        while (k != input) {
            for (i = a + 1; i < b; i++) {
                arr[k++] = i;
                if (k == input) {
                    System.out.println(arr[k-1]);
                    break;
                }
            }
            c = a + b;
            a = b;
            b = c;
        }
    }
}
