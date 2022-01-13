package URI_1113;
import java.util.Scanner;
public class AscendingDescending {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int X,Y;
        while(1==1)
        {
            X=obj.nextInt();
            Y=obj.nextInt();
            if(X==Y)
                System.exit(0);
            if(X>Y)
                System.out.println("Decrescente");
            else
                System.out.println("Crescente");
        }
    }
    
}
