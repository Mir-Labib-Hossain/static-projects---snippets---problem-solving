package URI_1557;

import java.util.Scanner;

public class Matrix3 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        byte N = 0;
        byte i = 0;
        byte j = 0;
        int ans = 1;
        int ans2;
        byte l2 = 0;
        while (true) {
            N = obj.nextByte();
            if (N == 0) {
                System.exit(0);
            }
            ans = (int) Math.pow(ans, 2);
            l2 = (byte) String.valueOf(ans).length();
            ans = 1;
            ans2 = 1;
            for (i = 1; i <= N; i++) {

                System.out.print(String.format("%" + (l2) + "s", ans));
                ans = ans * 2;
                ans2 = ans;
                for (j = 1; j < N; j++) {
                    System.out.print(String.format("%" + (l2 + 1) + "s", ans));
                    ans = ans * 2;
                }
                ans = ans2;
                System.out.println();
            }
            System.out.println();
        }
    }
}
