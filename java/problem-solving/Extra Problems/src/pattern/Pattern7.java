package pattern;
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        System.out.println("Enter row size :");
        int r = labib.nextInt();
        int c=0;
        int f=0,e=0;
        int i=0, j=0, k=0;
       for(i=0; i<r; i++)
       {
           for(j=1; j<=r; j++)
           {
               if(j<=r-i)
               {
               System.out.print(j);
               }
               else
               {
                   System.out.print("*");
               }
           }
           
           while(j>1)
           {
           j--;
           if(j>r-i)
           System.out.print("*");
           else
           System.out.print(j);
           }
           System.out.println("");
       } 
    }
}   