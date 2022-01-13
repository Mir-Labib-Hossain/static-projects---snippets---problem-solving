package URI_2709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coins {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int len, i, n, sum;
        boolean boo;
        String str;
        while ((str = input.readLine()) != null && str.length() != 0) {
            len = Integer.parseInt(str);
            int arr[] = new int[len];
            for (i = 0; i < len; i++) {
                arr[i] = Integer.parseInt((input.readLine()).trim());
            }
            n = Integer.parseInt(input.readLine());
            sum = 0;
            for (i = len - 1; i >= 0; i -= n) {
                sum += arr[i];
            }
            boo = false;
            for (i = 2; i <= sum / 2; ++i) {
                if (sum % i == 0) {
                    boo = true;
                    break;
                }
            }
            if (boo == true || sum == 1) {
                System.out.println("Bad boy! I’ll hit you.");
            } else {
                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            }
        }
    }
}
