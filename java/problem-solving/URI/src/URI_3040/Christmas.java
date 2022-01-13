package URI_3040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Christmas {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, test = Integer.parseInt(br.readLine());
        for (i = 0; i < test; i++) {
            String s[] = br.readLine().split(" ");
            if ((Integer.parseInt(s[0]) >= 200
                    && Integer.parseInt(s[0]) <= 300)
                    && Integer.parseInt(s[1]) >= 50
                    && Integer.parseInt(s[2]) >= 150) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
        }
    }
}
