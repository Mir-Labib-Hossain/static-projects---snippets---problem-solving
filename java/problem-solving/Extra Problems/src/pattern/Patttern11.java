package pattern;
import java.util.Scanner;
public class Patttern11 {
    public static void main(String[] args) {
        Scanner labib = new Scanner(System.in);
        System.out.print("Enter row size : ");
        int r =labib.nextInt();
        int n =1;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<r; j++)
            {
                if(j==0 || j==r-1 || i==r-1 || i==0)
                System.out.print(n);
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
