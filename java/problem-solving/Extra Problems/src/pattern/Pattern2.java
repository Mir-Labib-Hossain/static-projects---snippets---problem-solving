package pattern;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
    Scanner labib = new Scanner(System.in);
    System.out.println("Enter row size : ");
    int r= labib.nextInt();
    int c =(r*2+2);
    int m = (c/2);
    int k = c;
    for(int i=1; i<=r; i++)
    {
        for(int j=1; j<c; j++)
        {
            if(i==j || j==k-1 || j==m)
            {
                System.out.print("*");
                if(j==k-1 )
                k--;
            }
            else
            System.out.print(0);
        }
        System.out.println("");
    }
    }
    
}
