package MiddleNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, a, b, c;
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            System.out.print("Case "+(i+1)+": ");
            if ((a <= c && a > b) || (a <= b && a > c)) {
                System.out.println(a);
            } else if ((b <= c && b > a) || (b <= a && b > c)) {
                System.out.println(b);
            } else if ((c <= b && c > a) || (c <= a && c > b)) {
                System.out.println(c);
            }
        }
    }
}
