package URI_2896;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Offer {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, k, i, test = Integer.parseInt(br.readLine());
        for (i = 0; i < test; i++) {
            String s[] = br.readLine().split(" ");
            n = Integer.parseInt(s[0]);
            k = Integer.parseInt(s[1]);
            if (k > n) {
                System.out.println(n);
            } else {
                System.out.println(((n / k) + (n % k)));
            }
        }
    }
}
