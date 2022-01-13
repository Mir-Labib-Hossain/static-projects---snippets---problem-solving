package URI_1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Age {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y, m, d, x = Integer.parseInt(br.readLine());
        y = x / 365;
        x %= 365;
        m = (x / 30);
        x %= 30;
        d = x;
        System.out.println(y+" ano(s)\n"+m+" mes(es)\n"+d+" dia(s)");
    }
}
