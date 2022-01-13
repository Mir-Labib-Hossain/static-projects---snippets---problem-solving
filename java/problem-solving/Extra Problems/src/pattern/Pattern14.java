package pattern;
import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner labib = new Scanner(System.in);
        int r = 6;
        int j=0;
        for(int i=0; i<r; i++)
        {
            for(j=r-1; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++)
            {
                if(k==0 || k==i)
                    System.out.print("1 ");
                else
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
