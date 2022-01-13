package fibonaci_of_factorial;
import java.util.Scanner;
public class FibonaciOfFactorial {
    public static void main(String[] args) {
        Scanner labib = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = labib.nextInt();
        int f=1,c=0;
        for(int i = a; i>=1; i--)
        {
            f=f*i;
        }
        int i,m=1,n=2,b=m+n;
        int[] o = new int[f];
        for(i=1; i<=f; i++)
        {
            o[i]=m;
            
        }
        
        System.out.println(o[i]);
        
        System.out.println("Factorial of "+a+" is "+f);
        while(c==f)
        {
            
        }
        
        
    }
    
}
