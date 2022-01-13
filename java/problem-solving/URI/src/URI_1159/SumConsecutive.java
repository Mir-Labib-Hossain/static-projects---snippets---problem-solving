package URI_1159;
import java.util.Scanner;
public class SumConsecutive {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        while(1==1)
        {
            int ans=0;
            int count=0;
            int X = obj.nextInt();
            if(X==0)
                System.exit(0);
            while(count!=5)
            {
                if(X%2==0)
                {
                    ans+=X;
                    count++;
                }
                X++;
            }
            System.out.println(ans);
        }
    }
    
}
