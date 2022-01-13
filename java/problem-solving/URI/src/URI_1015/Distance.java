package URI_1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Distance {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");
        double x1 = Double.parseDouble(s1[0]);
        double y1 = Double.parseDouble(s1[1]);
        double x2 = Double.parseDouble(s2[0]);
        double y2 = Double.parseDouble(s2[1]);
        System.out.printf("%.4f\n", Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
}
