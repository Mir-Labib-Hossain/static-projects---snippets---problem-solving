package URI_1044;
import java.util.Scanner;
public class Multiples {
    public static void main(String []args)
    {
        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        int B = obj.nextInt();
        if( (B%A == 0) || (A%B == 0))
        System.out.println("Sao Multiplos");
        else
        System.out.println("Nao sao Multiplos");
    }
}
