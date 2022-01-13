package URI_2951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class King {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> arr = new HashMap<>();
        int i, test, n, x, sum = 0;
        String s1[] = br.readLine().split(" ");
        test = Integer.parseInt(s1[0]);
        n = Integer.parseInt(s1[1]);
        for (i = 0; i < test; i++) {
            String s2[] = br.readLine().split(" ");
            arr.put(s2[0], s2[1]);
        }
        x = Integer.parseInt(br.readLine());
        String s3[] = br.readLine().split(" ");
        for (i = 0; i < x; i++) {
            sum += Integer.parseInt(arr.get(s3[i]));
        }
        System.out.println(sum);
        if (sum >= n) {
            System.out.println("You shall pass!");
        } else {
            System.out.println("My precioooous");
        }
    }
}
