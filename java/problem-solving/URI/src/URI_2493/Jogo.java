package URI_2493;

import java.util.Scanner;

public class Jogo {
//This is correct in Debug + Form + Sample case, so dont waste on these insteade try with C

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, index, len;
        while (sc.hasNext()) {
            n = sc.nextInt();
            int n1[] = new int[n];
            int n2[] = new int[n];
            int ans[] = new int[n];
            String equal[] = new String[n];
            String name, fail = "";
            int c = n;
            sc.nextLine();
            for (i = 0; i < n; i++) {
                //input taken "x y=z""
                equal[i] = sc.nextLine();
                //condition for catching error
                if (equal[i].equals("")) {
                    i--;
                    continue;
                }
                //split "x y=z" base on " " so we get  x  &  y=z
                String spl[] = equal[i].split(" ");
                //split "y=z" base on "=" so we get  y  &  z
                String sp2[] = spl[1].split("=");
                n1[i] = Integer.parseInt(spl[0]);
                n2[i] = Integer.parseInt(sp2[0]);
                ans[i] = Integer.parseInt(sp2[1]);
            }
            for (i = 0; i < n; i++) {
                name = sc.nextLine();
                //condition for catching error
                if (name.equals("")) {
                    i--;
                    continue;
                }
                String option[] = name.split(" ");
                int num = Integer.parseInt(option[1]);
                index = num - 1;
                if (((option[2].equals("+")) && (n1[index] + n2[index] != ans[index]))
                        || ((option[2].equals("-")) && (n1[index] - n2[index] != ans[index]))
                        || ((option[2].equals("*")) && (n1[index] * n2[index] != ans[index]))
                        || ((option[2].equals("I"))
                        && ((n1[index] + n2[index] == ans[index])
                        || (n1[index] - n2[index] == ans[index])
                        || (n1[index] * n2[index] == ans[index])))) {
                    //add those names who guessed wrong
                    fail += option[0] + " ";
                    c--;
                }
            }
            if (c == n) {
                System.out.println("You Shall All Pass!");
            } else if (c == 0) {
                System.out.println("None Shall Pass!");
            } else {
                String t;
                String failArr[] = fail.split(" ");
                len = failArr.length;
                //Sorting Names
                for (i = 0; i < len; i++) {
                    for (j = 0; j < len - 1; j++) {
                        if (failArr[j].charAt(0) > failArr[j + 1].charAt(0)) {
                            t = failArr[j];
                            failArr[j] = failArr[j + 1];
                            failArr[j + 1] = t;
                        }
                    }
                }
                //Output Names
                for (i = 0; i < len; i++) {
                    System.out.print(failArr[i]);
                    if (i == len - 1) {
                        break;
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
