package URI_2780;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketBall {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int D = Integer.parseInt(br.readLine());
        if (D <= 800) {
            System.out.println("1");
        } else if (D <= 1400) {
            System.out.println("2");
        } else if (D <= 2000) {
            System.out.println("3");
        }
    }
}
