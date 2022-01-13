package URI_1143;
import java.util.Scanner;
public class Squared {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=3; j++)
            {
                System.out.print((int)Math.pow(i, j));
                if(j==3)
                    break;
                System.out.print(" ");
            }
            System.out.println();
        }
    }  
}
