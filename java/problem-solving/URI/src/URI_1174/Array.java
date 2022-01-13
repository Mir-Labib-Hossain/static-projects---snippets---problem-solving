package URI_1174;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double A[] = new double[100];
        for(int i=0; i<100; i++)
        {
        A[i]=obj.nextDouble();
        }
        for(int i=0; i<100; i++)
        {
            if(A[i]<=10)
            System.out.println("A["+i+"] = "+String.format("%.1f", A[i]));
        }
    }
    
}
