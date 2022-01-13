package ABoperator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, a, b, i;
        n = Integer.parseInt(br.readLine().trim());
        for (i = 0; i < n; i++) {
            String arr[] = br.readLine().trim().split(" ");
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            switch (arr[2]) {
                case "+":
                    System.out.println("Case " + (i + 1) + ": " + (a + b));
                    break;
                case "-":
                    System.out.println("Case " + (i + 1) + ": " + (a - b));
                    break;
                case "*":
                    System.out.println("Case " + (i + 1) + ": " + (a * b));
                    break;
                case "%":
                    System.out.println("Case " + (i + 1) + ": " + (int)(a % b));
                    break;
                case "/":
                    System.out.println("Case " + (i + 1) + ": " + (int)(a / b));
                    break;
                default:
                    break;
            }
        }
    }
}
