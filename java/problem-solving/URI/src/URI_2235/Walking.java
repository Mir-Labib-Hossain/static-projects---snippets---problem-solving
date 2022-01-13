package URI_2235;
import java.util.Scanner;
public class Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( (a==b) || (a==c) || (b==c))
            System.out.println("S");
        else if( ((a+b)==c) || ((b+c)==a) || ((a+c)==b))
            System.out.println("S");
        else
            System.out.println("N");
    }
    
}
