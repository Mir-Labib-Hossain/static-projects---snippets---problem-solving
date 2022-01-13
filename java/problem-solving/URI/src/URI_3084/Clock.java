package URI_3084;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clock {

    static String check(int x, int y) {
        if (x == 0) {
            return "00";
        } else {
            x = x / y;
            if (x >= 0 && x <= 9) {
                return "0" + x;
            } else {
                return x + "";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null && s.length() != 0) {
            String arr[] = s.split(" ");
            System.out.println(check(Integer.parseInt(arr[0]), 30) + ":" + check(Integer.parseInt(arr[1]), 6));
        }
    }
}
