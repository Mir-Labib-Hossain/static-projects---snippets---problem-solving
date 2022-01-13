package URI_1133;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        int Y = obj.nextInt();
        int t = 0;
        if(X>Y)
        {
            t=X;
            X=Y;
            Y=t;
        }
        for(int i=X+1; i<Y; i++)
        {
            if(i%5==2 || i%5==3)
                System.out.println(i);
        }
    }
    
}
