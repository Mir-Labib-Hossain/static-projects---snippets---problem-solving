package URI_3076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class History {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s=br.readLine())!=null && s.length()!=0) {
            System.out.println((((Integer.parseInt(s) + 99) / 100 ) * 100)/100);
        }
    }
}
