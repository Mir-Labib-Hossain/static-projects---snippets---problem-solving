package URI_1074;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        int N = obj.nextInt();
        int X = 0;
        for(int i =0; i<N; i++)
        {
            X = obj.nextInt();
        if(X==0)
                System.out.print("NULL");
            else
        {
                if(X%2==0)
                System.out.print("EVEN ");
            if(X%2!=0)
                System.out.print("ODD ");
            if(X>0)
                System.out.print("POSITIVE");
            if(X<0)
                System.out.print("NEGATIVE");
        }
            System.out.println("");
        }
    }
}
