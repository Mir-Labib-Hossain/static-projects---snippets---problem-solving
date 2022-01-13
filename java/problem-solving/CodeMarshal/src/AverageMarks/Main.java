package AverageMarks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test, i, j, length, avg;
        test = Integer.parseInt(br.readLine().trim());
        for (i = 0; i < test; i++) {
            String s[] = br.readLine().split(" ");
            length = s.length;
            avg = 0;
            for (j = 1; j < length; j++) {
                avg += Integer.parseInt(s[j]);
            }
            System.out.println("Case "+(i+1)+": "+(int)(avg/Integer.parseInt(s[0])));
        }
    }
}
