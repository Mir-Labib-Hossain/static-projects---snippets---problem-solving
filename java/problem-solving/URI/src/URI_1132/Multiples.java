package URI_1132;
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        int Y = obj.nextInt();
        int ans = 0;
        int t=0;
        if(X>Y)
        {
            t=X;
            X=Y;
            Y=t;
        }
        for(int i=X; i<=Y; i++)
        {
            if(i%13!=0)
                ans+=i;
        }
        System.out.println(ans);
    }
}
