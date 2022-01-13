package URI_2635;

import java.util.Scanner;

public class Web {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, n, q, temp;
        n = scanner.nextInt();
        scanner.nextLine();
        String[] sug = new String[n];
        for (i = 0; i < n; i++) {
            sug[i] = scanner.nextLine();
        }
        q = scanner.nextInt();
        scanner.nextLine();
        String[] inp = new String[q];
        int[] count = new int[q];
        int[] len = new int[q];
        for (i = 0; i < q; i++) {
            inp[i] = scanner.nextLine();
            temp = 0;
            for (j = 0; j < n; j++) {
                if (sug[j].startsWith(inp[i])) {
                    count[i]++;
                    if (temp < sug[j].length()) {
                        temp = sug[j].length();
                    }
                }
            }
            len[i] = temp;
        }
        for (i = 0; i < q; i++) {
            if (count[i] == 0) {
                System.out.println("-1");
            } else {
                System.out.println(count[i] + " " + len[i]);
            }
        }
    }
}
