package URI_2702;

import java.util.Scanner;

public class Hard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken1 = scanner.nextInt();
        int beef1 = scanner.nextInt();
        int pasta1 = scanner.nextInt();

        int chicken2 = scanner.nextInt();
        int beef2 = scanner.nextInt();
        int pasta2 = scanner.nextInt();

        int ans = 0;
        ans += (chicken2 > chicken1) ? (chicken2 - chicken1) : 0;
        ans += (beef2 > beef1) ? (beef2 - beef1) : 0;
        ans += (pasta2 > pasta1) ? (pasta2 - pasta1) : 0;

        System.out.println(ans);
    }
}
