package URI_1150;
import java.util.Scanner;
public class Exceeding {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        int count=1;
        int Z=0;
        while(1==1)
        {
            Z = obj.nextInt();
            if(Z>X)
                break;
        }
        int i=X;
        while(1==1)
        {
            if(X>Z)
                break;
            X+=i++;
            count++;
        }
        System.out.println(count);
    }
    
}
