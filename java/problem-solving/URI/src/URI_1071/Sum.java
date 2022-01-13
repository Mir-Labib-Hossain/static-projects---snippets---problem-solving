package URI_1071;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        int X = obj.nextInt();
        int Y = obj.nextInt();
        int ans=0;
        for(int i=Y+1; i<X; i++)
        {
            if(i%2!=0)
            {
                ans=ans+i;
            }
        }
        System.out.println(ans);
    }
    
}
