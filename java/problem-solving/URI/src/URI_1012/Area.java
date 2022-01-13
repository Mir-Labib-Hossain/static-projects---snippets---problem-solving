package URI_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c;
        String s[] = br.readLine().split(" ");
        a = Double.parseDouble(s[0].trim());
        b = Double.parseDouble(s[1]);
        c = Double.parseDouble(s[2]);
        System.out.printf("TRIANGULO: %.3f\n", (.5 * a * c));
        System.out.printf("CIRCULO: %.3f\n", (3.14159 * Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f\n", (((a + b) / 2) * c));
        System.out.printf("QUADRADO: %.3f\n", (b * b));
        System.out.printf("RETANGULO: %.3f\n", (a * b));
    }
}
