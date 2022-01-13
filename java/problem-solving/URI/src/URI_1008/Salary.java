package URI_1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        Double c = Double.parseDouble(br.readLine());
        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f\n", (b * c));
    }
}
