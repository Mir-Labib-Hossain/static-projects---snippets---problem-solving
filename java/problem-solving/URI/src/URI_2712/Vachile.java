package URI_2712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Vachile {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine().trim());
        int i;
        String regEx = "[A-Z]{3}\\W[0-9]{4}";
        String s;
        for (i = 0; i < n; i++) {
            s = input.readLine();
            if (Pattern.matches(regEx, s)) {
                switch (s.charAt(8 - 1)) {
                    case '1':
                    case '2':
                        System.out.println("MONDAY");
                        break;
                    case '3':
                    case '4':
                        System.out.println("TUESDAY");
                        break;
                    case '5':
                    case '6':
                        System.out.println("WEDNESDAY");
                        break;
                    case '7':
                    case '8':
                        System.out.println("THURSDAY");
                        break;
                    case '9':
                    case '0':
                        System.out.println("FRIDAY");
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("FAILURE");
            }
        }
    }
}
