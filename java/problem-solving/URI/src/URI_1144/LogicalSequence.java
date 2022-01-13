package URI_1144;
import java.util.Scanner;
public class LogicalSequence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int n1=0;
        int n2 =0;
        int n3 = 0;
        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=3; j++)
            {
                System.out.print((int)Math.pow(i, j)); 
                if(j==1)
                    n1=i;
                else if(j==2 )
                    n2=((int)Math.pow(i, j))+1;
                else if(j==3)
                    n3=((int)Math.pow(i, j))+1;
                if(j==3)
                    break;
                System.out.print(" ");        
            }
            System.out.println();
            for(int k=1; k<=3; k++)
            {
                if(k==1)
                    System.out.print(n1);
                else if(k==2)
                    System.out.print(n2);
                else if(k==3)
                    System.out.print(n3);
                if(k==3)
                    break;
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
