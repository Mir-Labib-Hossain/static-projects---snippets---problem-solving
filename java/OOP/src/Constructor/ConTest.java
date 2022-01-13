package Constructor;
import java.util.*;
public class ConTest {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);

        System.out.print("Enter your name  : ");
        String x = obj.nextLine();
        System.out.print("Enter your age   : ");
        int  y   = obj.nextInt();
        System.out.print("Enter your grade : ");
        char z   = obj.next().charAt(0);
        Constructors n=new Constructors(x,y,z);
        n.info();
}
}