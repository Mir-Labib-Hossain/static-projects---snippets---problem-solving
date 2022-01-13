package URI_1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simple {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ((Integer.parseInt(s1[1]) * Double.parseDouble(s1[2])) + (Integer.parseInt(s2[1]) * Double.parseDouble(s2[2]))));
    }
}
