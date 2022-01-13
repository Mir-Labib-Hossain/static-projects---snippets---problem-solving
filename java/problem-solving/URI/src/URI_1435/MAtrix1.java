package URI_1435;

import java.util.Scanner;

public class MAtrix1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n, i, j, k, c, z;
        //while( true )
        {
            n = 5;
            c = 1;
            z = 1;
            if (n == 0) {
                System.exit(0);
            }
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    if(i==z || j==z || i==n || j==n)
                        System.out.print(i+" "+j+"   ");
                    else
                        System.out.print(z+"     ");
                } 
                System.out.println();
            }
        }
    }
}