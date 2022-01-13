package URI_2782;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Stepladder {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i, count=0;
        n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int[] arr = Arrays.asList(s).stream().mapToInt(Integer::parseInt).toArray();
        for(i=0; i<n; i++){
            if(arr[i]==arr[i])
        }
    }
}
