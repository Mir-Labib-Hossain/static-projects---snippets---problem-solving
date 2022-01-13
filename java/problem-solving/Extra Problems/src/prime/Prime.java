package prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Mir Labib Hossain(011183007)\nEnter array length : ");
        int i, j, temp, b, n = Integer.parseInt(br.readLine());
        System.out.print("Enter " + n + " number : ");
        String s[] = br.readLine().split(" ");
        System.out.print("Prime :");
        for (i = 0; i < n; i++) {
            temp = Integer.parseInt(s[i]);
            b = 1;
            for (j = 2; j <= temp / 2; j++) {
                if (temp % j == 0) {
                    b = 0;
                    break;
                }
            }
            if (b == 1) {
                System.out.print(" " + temp);
            }
        }
        System.out.print("\nNot Prime :");
        for (i = 0; i < n; i++) {
            temp = Integer.parseInt(s[i]);
            for (j = 2; j <= temp / 2; j++) {
                if (temp % j == 0) {
                    System.out.print(" " + temp);
                    break;
                }
            }
        }
    }
}
