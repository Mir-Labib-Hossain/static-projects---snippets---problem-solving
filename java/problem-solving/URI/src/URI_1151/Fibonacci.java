package URI_1151;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int n1=0;
        int n2=1;
        int n3=n1+n2;
        for(int i=1; i<=N; i++)
        {
            System.out.print(n1);
            if(i==N)
                break;
            System.out.print(" ");
            n1=n2;
            n2=n3;
            n3=n1+n2;          
        }
        System.out.println();
    }
    
}
