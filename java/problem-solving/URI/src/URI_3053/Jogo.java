package URI_3053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jogo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, x, test = Integer.parseInt(br.readLine());
        int a = 0, b = 0, c = 0;
        String s = br.readLine();
        switch (s) {
            case "A":
                a = 1;
                break;
            case "B":
                b = 1;
                break;
            case "C":
                c = 1;
                break;
        }
        for (i = 0; i < test; i++) {
            x = Integer.parseInt(br.readLine());
            switch (x) {
                case 1: {
                    if (a == 1) {
                        b = 1;
                        a = 0;
                        s = "B";
                    } else if (b == 1) {
                        a = 1;
                        b = 0;
                        s = "A";
                    }
                    break;
                }
                case 2: {
                    if (b == 1) {
                        c = 1;
                        b = 0;
                        s = "C";
                    } else if (c == 1) {
                        b = 1;
                        c = 0;
                        s = "B";
                    }
                    break;
                }
                case 3: {
                    if (c == 1) {
                        a = 1;
                        c = 0;
                        s = "A";
                    } else if (a == 1) {
                        c = 1;
                        a = 0;
                        s = "C";
                    }
                    break;
                }
            }
        }
        System.out.println(s);
    }
}
