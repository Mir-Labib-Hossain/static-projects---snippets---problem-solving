package URI_1142;
import java.util.Scanner;
public class Pum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int ans =1;
        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=4; j++)
            {
                if(j==4)
                {
                    ans++;
                    break;
                }
                System.out.print(ans+" ");
                ans++;
            }
            System.out.println("PUM");
        }
    }
    
}
