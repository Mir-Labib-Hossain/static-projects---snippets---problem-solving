package URI_2670;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cafe {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());

        int t1 = a2 * 2 + a3 * 4;
        int t2 = a1 * 2 + a3 * 2;
        int t3 = a1 * 4 + a2 * 2;

        if (t1 <= t2 && t1 <= t3) {
            System.out.println(t1);
        } else if (t2 <= t1 && t2 <= t3) {
            System.out.println(t2);
        } else if (t3 <= t1 && t3 <= t2) {
            System.out.println(t3);
        }
    }
}
