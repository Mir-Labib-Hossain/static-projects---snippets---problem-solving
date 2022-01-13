package URI_2787;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l, c;
        l = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        System.out.println(((l + c) % 2) == 1 ? 0 : 1);
    }
}
