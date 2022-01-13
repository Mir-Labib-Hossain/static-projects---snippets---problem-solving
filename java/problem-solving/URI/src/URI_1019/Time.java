package URI_1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h, m, s, x = Integer.parseInt(br.readLine());
        h = x / (60 * 60);
        x %= (60 * 60);
        m = (x / 60);
        x %= 60;
        s = x;
        System.out.println(h + ":"  + m + ":" + s);
    }
}
