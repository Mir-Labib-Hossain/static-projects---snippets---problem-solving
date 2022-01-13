package super_variable;
import java.util.Scanner;
public class SuperVariable {
    public static void main(String[] args) {
    Scanner labib = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int a = labib.nextInt();
        int b = labib.nextInt();
        sup2 s = new sup2(a,b);
        s.info();
    }
}
