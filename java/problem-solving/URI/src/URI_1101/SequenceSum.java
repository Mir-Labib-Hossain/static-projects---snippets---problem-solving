package URI_1101;
import java.util.Scanner;
public class SequenceSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int M,N,t;
        while(1==1)
        {
            int sum=0;
            M=obj.nextInt();
            N=obj.nextInt();
            if(M<=0 || N<=0)
                System.exit(0);
            if(N>M)
            {
                t=N;
                N=M;
                M=t;
            }
            for(int i=N; i<=M; i++)
            {
                System.out.print(i+" "); 
                sum+=i;
            }
            System.out.println("Sum="+sum);
        }
    }
    
}
