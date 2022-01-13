package URI_2057;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = a+b+c;
        if(s==24)
            System.out.println("0");
        else if(s<0)
            System.out.println(24+s);
        else if(s>24)
            System.out.println(s-24);
        else if(s<24)
            System.out.println(s);
    }
    
}
