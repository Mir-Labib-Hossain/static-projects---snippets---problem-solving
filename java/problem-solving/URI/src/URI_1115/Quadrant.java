package URI_1115;
import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        while(1==1)
        {
            int X=obj.nextInt();
            int Y=obj.nextInt();
            if(X==0 || Y==0)
                System.exit(0);
            if(X>0 && Y>0)
                System.out.println("primeiro");
            else if(X>0 && Y<0)
                System.out.println("quarto");
            else if(X<0 && Y<0)
                System.out.println("terceiro");
            else if(X<0 && Y>0)
                System.out.println("segundo");
        }
    }   
}
