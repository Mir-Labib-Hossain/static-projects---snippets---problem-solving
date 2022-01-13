package URI_2552;

import java.util.Scanner;

public class Cheese {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr[][] = new int[a][b];
            int brr[][] = new int[a][b];
            String s = "";
            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    if (arr[i][j] == 1) {
                        brr[i][j] = 9;
                    } else {
                        brr[i][j] = 0;
                        if (i != 0 && arr[i - 1][j] == 1) {
                            brr[i][j]++;
                        }
                        if (j != b - 1 && arr[i][j + 1] == 1) {
                            brr[i][j]++;
                        }
                        if (i != a - 1 && arr[i + 1][j] == 1) {
                            brr[i][j]++;
                        }
                        if (j != 0 && arr[i][j - 1] == 1) {
                            brr[i][j]++;
                        }
                    }
                    s += brr[i][j];
                }
                s += "\n";
            }
            System.out.print(s);
        }
    }
}
