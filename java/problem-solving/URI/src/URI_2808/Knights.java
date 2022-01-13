package URI_2808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Knights {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        char ipC = s[0].charAt(0);
        int ipI = Integer.parseInt(String.valueOf(s[0].charAt(1)));
        char tpC = s[1].charAt(0);
        int tpI = Integer.parseInt(String.valueOf(s[1].charAt(1)));
        if ((ipC + 1 == tpC && ipI + 2 == tpI)
        || (ipC + 2 == tpC && ipI + 1 == tpI)
        || (ipC + 2 == tpC && ipI - 1 == tpI)
        || (ipC + 1 == tpC && ipI - 2 == tpI)
        || (ipC - 1 == tpC && ipI - 2 == tpI)
        || (ipC - 2 == tpC && ipI - 1 == tpI)
        || (ipC + 1 == tpC && ipI + 2 == tpI)
        || (ipC - 2 == tpC && ipI + 1 == tpI)
        || (ipC - 1 == tpC && ipI + 2 == tpI)) {
            System.out.println("VALIDO");
        } else {
            System.out.println("INVALIDO");
        }
    }
}
