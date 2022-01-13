package URI_1158;
import java.util.Scanner;
public class SumConsecutive {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        for(int i=1; i<=N; i++)
        {
            int count=0;
            int ans=0;
            int X = obj.nextInt();
            int Y = obj.nextInt();
            while(count!=Y)
            {
                if(X%2!=0)
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
