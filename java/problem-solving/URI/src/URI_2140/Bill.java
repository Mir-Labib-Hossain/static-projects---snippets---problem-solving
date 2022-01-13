package URI_2140;
import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, ans, f=0;
        int arr[]={2,5,10,20,50,100};
        while(true)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0 && b==0)
                break;
            ans = b-a;
            for(int i=0; i<arr.length; i++)
            {
                a:
                for(int j=0; j<arr.length; j++)
                {
                    if(ans-arr[i]-arr[j]==0)
                    {
                        f=1;
                        break a;
                    }
                }
            }
            if(f==1)
                System.out.println("possible");
            else
                System.out.println("impossible");
            f=0;
            
        }
    }
    
}