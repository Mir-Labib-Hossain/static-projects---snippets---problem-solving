package URI_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sphere {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());
        System.out.printf("VOLUME = %.3f\n",((4.0/3)*3.14159*Math.pow(r,3)));
    }
}
