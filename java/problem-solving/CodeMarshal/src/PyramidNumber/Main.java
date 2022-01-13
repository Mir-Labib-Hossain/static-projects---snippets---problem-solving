package PyramidNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j,k, n, test = Integer.parseInt(br.readLine());

        for (i = 1; i <= test; i++) {
            n = Integer.parseInt(br.readLine());
            System.out.println("Case "+i+":");
            for(j=1; j<=n; j++){
                for(k=1; k<=j; k++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}
