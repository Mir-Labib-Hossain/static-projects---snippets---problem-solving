package UVA_100;

import java.util.Scanner;

public class The_3n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        while (sc.hasNextLong()) {
            a = sc.nextInt();
            b = sc.nextInt();

            int n = 0, t = 0;
            int i, c = 1, ans = 0;
            if (a > b) {
                t = a;
                a = b;
                b = t;
            }
            for (i = a; i <= b; i++) {
                n = i;
                while (true) {
                    if (n == 1) {
                        break;
                    }
                    if (n % 2 != 0) {
                        n = (3 * n) + 1;
                    } else {
                        n = n / 2;
                    }
                    c++;
                }
                if (c > ans) {
                    ans = c;
                }
                c = 1;
            }
            if (t == 0) {
                System.out.println(a + " " + b + " " + ans);
            } else {
                System.out.println(b + " " + a + " " + ans);
            }
        }
    }
}
