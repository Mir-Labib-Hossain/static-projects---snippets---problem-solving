package URI_1837;

import java.util.Scanner;

public class Preface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int q, r, i = 1;
        if (a >= 0 || a%b==0 ) {
            q = a / b;
        }else {
            if (a < 0 && b < 0) {
                while (true) {
                    if (i * b < a) {
                        break;
                    }
                    i++;
                }
            } else {
                i = 0;
                while (true) {
                    if (i * b < a) {
                        break;
                    }
                    i--;
                }
            }
            q = i;
        }
        r = a - q * b;
        System.out.println(q + " " + r);
    }
}
