package URI_2724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Help {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i, j, k, n, t, u;
        boolean b = false;
        n = Integer.parseInt(input.readLine().trim());
        for (i = 0; i < n; i++) {
            t = Integer.parseInt(input.readLine().trim());
            String elements[] = new String[t];
            for (j = 0; j < t; j++) {
                elements[j] = input.readLine();
            }
            u = Integer.parseInt(input.readLine().trim());
            String experiments[] = new String[u];
            for (k = 0; k < u; k++) {
                experiments[k] = input.readLine();
                for (j = 0; j < t; j++) {
                    if ((elements[j].length() + experiments[k].indexOf(elements[j]) + 1) > experiments[k].length() && experiments[k].length() >= elements[j].length()) {
                        b = true;
                    } else if (experiments[k].contains(elements[j])
                            && (!Pattern.matches("\\d", experiments[k].substring(elements[j].length() + experiments[k].indexOf(elements[j]), elements[j].length() + experiments[k].indexOf(elements[j]) + 1))
                            && !Pattern.matches("[el]", experiments[k].substring(elements[j].length() + experiments[k].indexOf(elements[j]), elements[j].length() + experiments[k].indexOf(elements[j]) + 1)))) {
                        b = true;
                    }
                }
                if (b == true) {
                    System.out.println("Abortar");
                    b = false;
                } else {
                    System.out.println("Prossiga");
                }
            }
            if (i != n - 1) {
                System.out.println("");
            }
        }
    }
}
