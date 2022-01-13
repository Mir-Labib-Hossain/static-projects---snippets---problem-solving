package pattern;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
Scanner labib = new Scanner(System.in);
        System.out.println("Entr Row Size : ");
        int r = labib.nextInt();
        
        for(int i=1; i<=r; i++)
        {
            for(int j=r; j>=1; j--)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
}    
}
