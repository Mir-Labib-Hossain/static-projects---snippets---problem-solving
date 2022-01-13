package URI_2520;

import java.util.Scanner;

public class Last {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            int pi = 0, pj = 0, mi = 0, mj = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                    if (arr[i][j] == 2) {
                        pi = i;
                        pj = j;
                    } else if (arr[i][j] == 1) {
                        mi = i;
                        mj = j;
                    }
                }
            }
            System.out.println(Math.abs(pj - mj) + Math.abs(pi - mi));
        }
    }
}
