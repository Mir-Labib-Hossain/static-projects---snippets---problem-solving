package URI_2221;
import java.util.Scanner;
public class Pomekons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b;
        int a, d, l;
        int a2, d2, l2;
        for(int i=0; i<n; i++)
        {
            b=sc.nextInt();
            a=sc.nextInt();
            d=sc.nextInt();
            l=sc.nextInt();
            
            a2=sc.nextInt();
            d2=sc.nextInt();
            l2=sc.nextInt();
            
            if(l%2==0 && l2%2!=0)
            {
                l=b;
                l2=0;
            }
            else if(l2%2==0 && l%2!=0)
            {
                l=0;
                l2=b;
            }
            else
            {
                l=0;
                l2=0;
            }
            
            a = ((a+d)/2)+l;
            a2 = ((a2+d2)/2)+l2;
            if(a==a2)
                System.out.println("Empate");
            else if( a>a2)
                System.out.println("Dabriel");
            else if(a<a2)
                System.out.println("Guarte");
            
        }
    }
}
