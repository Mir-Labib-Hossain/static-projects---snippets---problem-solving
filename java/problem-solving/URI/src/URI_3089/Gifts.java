package URI_3089;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gifts {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i, j, min, max, temp;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            String s[] = br.readLine().split(" ");
            min = Integer.parseInt(s[0]) + Integer.parseInt(s[n * 2 - 1]);
            max = min;
            for (i = 0, j = n * 2 - 1; i < n; i++, j--) {
                temp = Integer.parseInt(s[i]) + Integer.parseInt(s[j]);
                if (temp > max) {
                    max = temp;
                } else if(temp < min) {
                    min = temp;
                }
            }
            System.out.println(max + " " + min);
        }
    }
}
