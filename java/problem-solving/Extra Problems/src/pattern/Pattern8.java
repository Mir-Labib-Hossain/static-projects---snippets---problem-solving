package pattern;
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        int m = 10;
        int c=0;
        int z=1;
        int f=m+1;
        for(int i=0; i<=m; i++)
        {
            for(int j=0; j<i*2-1; j++)
            {
            c++;            
            }
            
            for(int j=0; j<i*2-1; j++)
            {
                if(z==0)
                f--;
                else
                    f++;
                if(j==c/2)
                {
                    z=0;
                    System.out.print(z);
                }
                else
                {
                    System.out.print(f);
                }
            }
            f=f-2;
            z=1;
            c=0;
        System.out.println("");
        }
        
    }
    
}
