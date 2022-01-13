package URI_2936;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cassava {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, sum = 225;
        int arr[] = {300, 1500, 600, 1000, 150};
        for (i = 0; i < 5; i++) {
            sum += Integer.parseInt(br.readLine()) * arr[i];
        }
        System.out.println(sum);
    }
}
