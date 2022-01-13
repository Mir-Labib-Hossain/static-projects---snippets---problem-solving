package URI_1929;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = obj.nextInt();
        int count = 0;
        if((a+b>c && b+c>a && a+c>b) || (b+c>d && c+d>b && b+d>c) || (a+c>d && c+d>a && a+d>c) || (a+b>d && b+d>a && a+d>b))
            System.out.println("S");
        else
            System.out.println("N");
            
    }
}
