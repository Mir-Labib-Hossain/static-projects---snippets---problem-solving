package URI_2757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Integers {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i, j;
        int arr[] = new int[3];
        int len[] = new int[3];
        String s[] = {"A", "B", "C"};

        for (i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(input.readLine());
            len[i] = 10 - Integer.toString(arr[i]).length();
        }
/////////////////////////////////////////////////////
        System.out.println("A = " + arr[0] + ", B = " + arr[1] + ", C = " + arr[2]);
/////////////////////////////////////////////////////
        for (i = 0; i < 3; i++) {
            System.out.print(s[i] + " = ");
            for (j = 0; j < len[i]; j++) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }
        System.out.println("");
///////////////////////////////////////////////////////
        for (i = 0; i < 3; i++) {
            System.out.print(s[i] + " = ");
            if (arr[i] < 0) {
                System.out.print("-");
            }
            for (j = 0; j < len[i]; j++) {
                System.out.print("0");
            }
            System.out.print(Math.abs(arr[i]));
            if (i != 2) {
                System.out.print(", ");
            }
        }
        System.out.println("");
////////////////////////////////////////////////////////
        for (i = 0; i < 3; i++) {
            System.out.print(s[i] + " = " + arr[i]);
            for (j = 0; j < len[i]; j++) {
                System.out.print(" ");
            }
            if (i != 2) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
