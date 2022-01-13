package URI_2143;
import java.util.Scanner;
public class Radar {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i, n, a;
       while(true)
       {
           n = sc.nextInt();
           if(n==0)
               break;
           for(i=0; i<n; i++)
           {
               a = sc.nextInt();
               if(a%2==0)
                   System.out.println(a*2-2);
               else
                   System.out.println(a*2-1);
           }
       }
    }
}
