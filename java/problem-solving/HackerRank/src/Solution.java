
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class Solution {

    public boolean arrayStringsAreEqual(String[] s1a, String[] s2a) {
        String s1 = "", s2 = "";
        for (String s1a1 : s1a) {
            s1 += s1a1;
        }
        for (String s2al : s2a) {
            s2 += s2al;
        }
        return s1.equals(s2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1a[] = br.readLine().split(" ");
        String s2a[] = br.readLine().split(" ");
        Solution s = new Solution();
        System.out.println(s.arrayStringsAreEqual(s1a, s2a));
    }
}
