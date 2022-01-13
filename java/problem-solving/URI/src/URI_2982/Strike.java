package URI_2982;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strike {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, g = 0, v = 0, test = Integer.parseInt(br.readLine());
        for (i = 0; i < test; i++) {
            String s[] = br.readLine().split(" ");
            if (s[0].equals("G")) {
                g += Integer.parseInt(s[1]);
            } else {
                v += Integer.parseInt(s[1]);
            }
        }
        if (g > v) {
            System.out.println("NAO VAI TER CORTE, VAI TER LUTA!");
        } else {
            System.out.println("A greve vai parar.");
        }
    }
}
