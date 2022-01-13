package URI_2968;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String s[] = br.readLine().split(" ");
        double x = Double.parseDouble(s[0])*Double.parseDouble(s[1]);
        System.out.print((int) Math.ceil((x * 10) / 100));
        for (i = 20; i <= 90; i += 10) {
            System.out.print(" " + (int) Math.ceil((x * i) / 100));
        }
        System.out.println();
    }
}
