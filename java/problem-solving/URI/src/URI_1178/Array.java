package URI_1178;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double X = obj.nextDouble();
        int N[] = new int[100];
        for(int i=0; i<100; i++)
        {
            System.out.println("N["+i+"] = "+String.format("%.4f",X));
            X=X/2;
        }
    }
    
}
