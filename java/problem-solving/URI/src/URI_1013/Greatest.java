package URI_1013;

import java.util.Scanner;

public class Greatest {

    int check(int a, int b) {
        int ans = 0;
        if (a >= b) {
            ans = (a + b + (a - b)) / 2;
        } else if (a < b) {
            ans = (a + b - (a - b)) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Greatest g = new Greatest();
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int ans = g.check(a, b);
        ans = g.check(ans, c);
        System.out.println(ans + " eh o maior");
    }
}
