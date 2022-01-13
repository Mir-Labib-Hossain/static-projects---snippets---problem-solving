package pulseRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Pulse {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);
    int test, a, b, f, i;
    String s;
    while (true) {
      test = scanner.nextInt();
      if (test == 0) break;
      int arr[] = new int[test + 1];
      a = 2;
      f = 0;
      s = "";
      arr[0] = scanner.nextInt();
      arr[test] = arr[0];
      for (i = 1; i < test + 1; i++) {
        if (i != test) arr[i] = scanner.nextInt();
        if (arr[i - 1] > arr[i]) {
          b = 0;
          s += "-";
        } else {
          b = 1;
          s += "+";
        }
        if (b != a) f++;
        a = b;
      }
      if (s.charAt(0) == s.charAt(test - 1)) f--;
      System.out.println(f);
    }
  }
}
//Input Sample
//2
//1 -3
//6
//40 0 -41 0 41 42
//4
//300 450 449 450
//0
//Output Sample
//2
//2
//4