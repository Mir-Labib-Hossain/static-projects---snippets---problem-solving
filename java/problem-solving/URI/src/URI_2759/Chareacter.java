package URI_2759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chareacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        System.out.println("A = "+a+", B = "+b+", C = "+c);
        System.out.println("A = "+b+", B = "+c+", C = "+a);
        System.out.println("A = "+c+", B = "+a+", C = "+b);
    }
}
