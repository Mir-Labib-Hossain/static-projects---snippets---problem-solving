package URI_3046;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dominó {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(((n + 1) * (n + 2)) / 2);
    }
}
