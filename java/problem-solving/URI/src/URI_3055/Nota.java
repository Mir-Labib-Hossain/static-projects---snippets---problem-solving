package URI_3055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nota {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int av = Integer.parseInt(br.readLine());
        System.out.println((2*av)-s);
    }
}
