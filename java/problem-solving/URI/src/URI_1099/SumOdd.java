package URI_1099;
import java.util.Scanner;
public class SumOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int t=0;
        int a[] = new int[N];
        int X=0,Y=0;
        for(int i=0; i<N; i++)
        {
            X = obj.nextInt();
            Y = obj.nextInt();
            if(X>Y)
            {
               t=X;
               X=Y;
               Y=t;
            }
            for(int j=X+1; j<Y; j++)
            {
                if(j%2!=0)
                    a[i]+=j;
            }
        }
        for(int i:a)
            System.out.println(i);
    }
}