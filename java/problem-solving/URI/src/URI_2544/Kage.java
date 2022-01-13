package URI_2544;

import java.util.Scanner;

public class Kage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            for (i = 0; i < n; i++) {
                if (Math.pow(2, i) == n) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
