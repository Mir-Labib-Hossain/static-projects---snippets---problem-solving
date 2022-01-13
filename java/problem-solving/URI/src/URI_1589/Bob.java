package URI_1589;
import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        int r1 = 0;
        int r2 = 0;
        while(T!=0)
        {
            r1 = obj.nextInt();
            r2 = obj.nextInt();
            System.out.println(r1+r2);
            T--;
        }
    }
    
}
