package pattern;
import java.util.Scanner;
public class Pattern4 {
   public static void main(String[] args){ 
       Scanner labib = new Scanner (System.in);
       System.out.print("Enter Maximum Number :");
   int m =labib.nextInt();
   int i=0, j=0, k=0, c=0;
   for(i=0; i<m; i++)
   {
      for(j=0; j<i; j++)
      {
          System.out.print(" ");
      }
      for(k=m; k>i; k-- )
      {
            if(k-1==i || k==m)
          System.out.print(i+1+" ");
         else
             System.out.print("  ");
      }
       System.out.println("");
       c++;
   }
   for(i=1; i<m; i++)
   {
       c--;
       for(j=m-1; j>i; j--)
       {
           System.out.print(" ");
       }
       for(k=0; k<=i; k++)
       {
           if(k==0 || k==j)
           {
               System.out.print(c+" ");
           }
           else
           {
               System.out.print("  ");
           }
       }
       System.out.println("");
   }
   }
}
