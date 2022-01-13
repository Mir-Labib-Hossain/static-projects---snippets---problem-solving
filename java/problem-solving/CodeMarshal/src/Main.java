//codeMarshal

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, n, test = Integer.parseInt(br.readLine());
        for (i = 1; i <= test; i++) {
            n = Integer.parseInt(br.readLine());
            System.out.println("Case " + i + ":");
            for (j = 1; j <= 10; j++) {
                System.out.println(n + " * " + j + " = " + (j * n));
            }
        }

    }
}
