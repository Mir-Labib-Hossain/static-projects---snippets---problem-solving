package URI_1017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fuel {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        System.out.printf("%.3f\n", (b / 12) * a);
    }
}