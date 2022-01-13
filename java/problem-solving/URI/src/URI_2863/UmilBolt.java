package URI_2863;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UmilBolt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, test;
        Double n, max;
        String s;
        while ((s = br.readLine()) != null && s.length() != 0) {
            test = Integer.parseInt(s);
            max = 12.00;
            for (i = 0; i < test; i++) {
                n = Double.parseDouble(br.readLine());
                if (n < max) {
                    max = n;
                }
            }
            System.out.println(max);
        }
    }
}
