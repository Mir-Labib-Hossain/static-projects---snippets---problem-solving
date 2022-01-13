package even_odd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EvenOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Mir Labib Hossain(011183007)\nEnter array length : ");
        int i, n = Integer.parseInt(br.readLine());
        System.out.print("Enter " + n + " number : ");
        String s[] = br.readLine().split(" ");
        System.out.print("Even :");
        for (i = 0; i < n; i++) {
            if (Integer.parseInt(s[i]) % 2 == 0) {
                System.out.print(" " + s[i]);
            }
        }
        System.out.print("\nOdd :");
        for (i = 0; i < n; i++) {
            if (Integer.parseInt(s[i]) % 2 != 0) {
                System.out.print(" " + s[i]);
            }
        }
    }
}
