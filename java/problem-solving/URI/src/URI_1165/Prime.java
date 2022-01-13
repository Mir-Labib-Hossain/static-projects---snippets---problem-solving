package URI_1165;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        for(int i=0; i<N; i++)
        {
            int check =0;
            int X = obj.nextInt();
            
            for(int j=2; j<=X/2; j++)
            {
                if(X%j==0)
                check++;
            }
            if(check==0)
                System.out.println(X+" eh primo");
            else
                System.out.println(X+" nao eh primo"); 
        }
    }
    
}
