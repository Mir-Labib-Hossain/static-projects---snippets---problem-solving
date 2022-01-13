package URI_3039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Santas {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, f = 0, m = 0, test = Integer.parseInt(br.readLine());
        for (i = 0; i < test; i++) {
            String s[] = br.readLine().split(" ");
            if (s[1].equals("F")) {
                f++;
            } else {
                m++;
            }
        }
        System.out.println(m + " carrinhos");
        System.out.println(f + " bonecas");
    }
}
