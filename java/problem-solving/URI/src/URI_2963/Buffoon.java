package URI_2963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffoon {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, c, o, test = Integer.parseInt(br.readLine());
        boolean b = true;
        c = Integer.parseInt(br.readLine());
        for (i = 1; i < test; i++) {
            o = Integer.parseInt(br.readLine());
            if (c < o) {
                b = false;
            }
        }
        if (b == true) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
