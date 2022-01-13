package URI_2770;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y, m, a, b, i;
        String s;
        while ((s = br.readLine()) != null && s.length() != 0) {
            String s1[] = s.split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            m = Integer.parseInt(s1[2]);
            for (i = 0; i < m; i++) {
                String s2[] = br.readLine().split(" ");
                a = Integer.parseInt(s2[0]);
                b = Integer.parseInt(s2[1]);
                if (a <= x && b <= y || a <= y && b <= x) {
                    System.out.println("Sim");
                } else {
                    System.out.println("Nao");
                }
            }
        }
    }
}
