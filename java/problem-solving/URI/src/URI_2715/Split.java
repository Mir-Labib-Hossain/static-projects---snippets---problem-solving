package URI_2715;

import java.util.Arrays;
import java.util.Scanner;

public class Split {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, r, g;
        while (input.hasNext()) {
            n = input.nextInt();
            int arr[] = new int[n];
            r = 0;
            g = 0;
            for (i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                
            }
            Arrays.sort(arr);
        }

    }
}
