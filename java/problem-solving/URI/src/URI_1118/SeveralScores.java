package URI_1118;
import java.util.Scanner;
public class SeveralScores {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int X = 1;
        double ans=0;
        int count =0;
        while(X==1)
        {
            double n = obj.nextDouble();
            if(n>=0 && n<=10.0)
            {
                ans+=n;
                count++;
            }
            else
            {
                System.out.println("nota invalida");
            }
            if(count==2)
            {
                System.out.println("media = "+String.format("%.2f",ans/2));
                ans=0;
                count=0;
                    while(1==1)
                    {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        X=obj.nextInt();
                        if(X==2)
                            System.exit(0);
                        if(X==1)
                            break;
                    }
            }    
        }
    }
    
}
