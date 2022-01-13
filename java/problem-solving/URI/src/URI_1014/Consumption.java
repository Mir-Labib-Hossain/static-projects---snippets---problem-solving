package URI_1014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consumption {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        double b = Double.parseDouble(br.readLine());
        System.out.printf("%.3f km/l\n", (a / b));
    }
}
