package URI_3042;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delflecting {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l, c, r, i, t, test;

        while ((test = Integer.parseInt(br.readLine())) != 0) {
            l = 0;
            c = 1;
            r = 0;
            t = 0;

            for (i = 0; i < test; i++) {
                String s[] = br.readLine().split(" ");
                if (c == 1) {
                    if (s[1].equals("1")) {
                        t++;
                        c = 0;
                        if (s[0].equals("1")) {
                            r = 1;
                        }
                        if (s[2].equals("1")) {
                            l = 1;
                        }
                    }
                } else if (l == 1) {
                    if (s[0].equals("1")) {
                        t++;
                        l = 0;
                        c = 1;
                        if (s[1].equals("1")) {
                            t++;
                            r = 1;
                            c = 0;
                        }
                    }
                } else if (r == 1) {
                    if (s[2].equals("1")) {
                        t++;
                        r = 0;
                        c = 1;
                        if (s[1].equals("1")) {
                            t++;
                            l = 1;
                            c = 0;
                        }
                    }
                }
            }
            System.out.println(t);
        }
    }
}
