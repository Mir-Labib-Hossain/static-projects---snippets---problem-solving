package URI_2850;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parrot {

    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null && s.length() != 0) {
            switch (s) {
                case "esquerda":
                    System.out.println("ingles");
                    break;
                case "direita":
                    System.out.println("frances");
                    break;
                case "nenhuma":
                    System.out.println("portugues");
                    break;
                case "as duas":
                    System.out.println("caiu");
                    break;
                default:
                    break;
            }
        }
    }
}
