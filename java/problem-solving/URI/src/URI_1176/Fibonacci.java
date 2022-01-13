package URI_1176;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for(int i=1; i<=T; i++)
        {
            int N = obj.nextInt();
            long n1 = 0;
            long n2 = 1;
            long n3 = n1+n2;
            for(int j=0; j<=N; j++)
            {
                if(j == N)
                {
                    System.out.println("Fib("+j+") = "+n1);
                }
                n1=n2;
                n2=n3;
                n3=n1+n2;
            }
        }
    }
    
}
