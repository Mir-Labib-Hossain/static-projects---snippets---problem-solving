package CountWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, n, ans, test = Integer.parseInt(br.readLine());
        for (j = 0; j < test; j++) {
            n = Integer.parseInt(br.readLine());
            ans = n;
            String s[] = new String[n];
            for (i = 0; i < n; i++) {
                s[i] = br.readLine();
            }
            Arrays.sort(s);
            for (i = 1; i < n; i++) {
                if (!s[i].equals(s[i - 1])) {
                    ans--;
                }
            }
            System.out.println(n-ans+1);
        }
    }
}
