package URI_1153;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int f=1;
        for(int i=1; i<=N; i++)
            f=f*i;
        System.out.println(f);
    }
}
