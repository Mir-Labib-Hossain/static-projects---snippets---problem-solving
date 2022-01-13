package URI_1149;
import java.util.Scanner;
public class Summing {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int A=obj.nextInt();
        int N=0;
        int ans=0;
        while(1==1)
        {
            N =obj.nextInt();
            if(N>0)
                break;
        }
        for(int i=A; i<A+N; i++)
            ans+=i;
            System.out.println(ans);
   
    }
    
}
