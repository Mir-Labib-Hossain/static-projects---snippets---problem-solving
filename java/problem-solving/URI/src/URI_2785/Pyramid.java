package URI_2785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramid {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i, j, sum;
        n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            for(j=0; j<n; j++){
                arr[i][j]=Integer.parseInt(s[j]);
            }
        }
        
    }
}