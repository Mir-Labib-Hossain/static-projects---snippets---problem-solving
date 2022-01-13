package URI_1002;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double R = obj.nextDouble();
        System.out.println("A="+(String.format("%.4f",3.14159*(R*R))));
}
    }
