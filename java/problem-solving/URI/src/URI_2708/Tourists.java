package URI_2708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tourists {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int car = 0, tourist = 0;
        while (true) {
            String s[] = br.readLine().split(" ");
            if (s[0].equals("ABEND")) {
                break;
            } else {
                if (s[0].equals("SALIDA")) {
                    car++;
                    tourist += Integer.parseInt(s[1]);
                } else {
                    car--;
                    tourist -= Integer.parseInt(s[1]);
                }
            }
        }
        System.out.println(tourist);
        System.out.println(car);
    }
}
