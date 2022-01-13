package URI_3037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Distance {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, mary, john, test = Integer.parseInt(br.readLine());
        for (i = 0; i < test; i++) {
            mary = 0;
            john = 0;
            for (j = 0; j < 3; j++) {
                String s[] = br.readLine().split(" ");
                john += Integer.parseInt(s[0]) * Integer.parseInt(s[1]);
            }
            for (j = 0; j < 3; j++) {
                String s[] = br.readLine().split(" ");
                mary += Integer.parseInt(s[0]) * Integer.parseInt(s[1]);
            }
            if (mary > john) {
                System.out.println("MARIA");
            } else {
                System.out.println("JOAO");
            }
        }
    }
}
