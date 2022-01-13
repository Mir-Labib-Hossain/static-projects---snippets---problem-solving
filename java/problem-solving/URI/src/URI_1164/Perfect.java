package URI_1164;
import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        for(int i=1; i<=N; i++)
        {
            int ans = 0;
            int X = obj.nextInt();
            for(int j=1; j<X; j++)
            {
                if(X%j==0)
                    ans+=j;
            }
            if(ans==X)
                System.out.println(X+" eh perfeito");
            else
                System.out.println(X+" nao eh perfeito");
        }
    }
    
}
