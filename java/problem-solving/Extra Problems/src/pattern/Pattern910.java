package pattern;
import java.util.Scanner;
public class Pattern910 {
    public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        System.out.print("Enter Row Size : ");
        int r =labib.nextInt();
        int i=0, j=0;
        char c ='A';
        for(i=0; i<r; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print(c+" ");
            }
            c++;
            System.out.println("");
        }
    }
    
}
