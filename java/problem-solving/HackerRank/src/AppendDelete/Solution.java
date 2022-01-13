package AppendDelete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k, l, l1, l2, i, j;
        String[] s1 = br.readLine().split("");
        String[] s2 = br.readLine().split("");
        l1 = s1.length;
        l2 = s2.length;
        l = (s1.length < s2.length) ? s1.length : s2.length;
        k = Integer.parseInt(br.readLine());
        for (i = 0; i < l; i++) {
            if (!s1[i].equals(s2[i])) {
                k -= 2;
            }
        }
        if (l1 > l2) {
            k -= Math.abs(s1.length - s2.length) * 2;
        }
        k -= Math.abs(s1.length - s2.length);
        if (k >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
