package URI_2930;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Final {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        if (a > b) {
            System.out.println("Eu odeio a professora!");
        } else {
            if ( a <= b-3) {
                System.out.println("Muito bem! Apresenta antes do Natal!");
            } else {
                System.out.println("Parece o trabalho do meu filho!");
                if (a + 2 < 24) {
                    System.out.println("TCC Apresentado!");
                } else {
                    System.out.println("Fail! Entao eh nataaaaal!");
                }
            }
        }
    }
}
