package CountingNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test, n, i, j, k, max, dub, count, t;
        test =  Integer.parseInt(br.readLine().trim());
        for (j = 0; j < test; j++) {
            String s[] = br.readLine().trim().split(" ");
            n = Integer.parseInt(s[0].trim());
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i+1]);
            }
            Arrays.sort(arr);
            max = arr[0];
            count = 1;
            t = 0;
            dub = -1;
            for (i = 1; i < n; i++) {
                if (arr[i - 1] == arr[i]) {
                    count++;
                    if(t<=count)
                    dub = arr[i];
                } if (t < count) {
                    t = count;
                }
                if (arr[i - 1] != arr[i]) {
                    count = 1;
                }
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.print("Case " + (j + 1) + ": ");
            if (dub == -1) {
                System.out.println(max + " " + t);
            } else {
                System.out.println(dub + " " + t);
            }
        }
    }
}
