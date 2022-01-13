package URI_3140;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        String s;
        while (!(s = br.readLine()).trim().equals("</body>")) {
            if (c == 1) {
                System.out.println(s);
            } else if (s.trim().equals("<body>")) {
                c = 1;
            }
        }
    }
}
