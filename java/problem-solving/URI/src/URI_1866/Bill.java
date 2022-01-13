package URI_1866;
import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num;
        int test = obj.nextInt();
        for(int i=0; i<test; i++)
        {
            num = obj.nextInt();
            System.out.println(num%2);
        }
    }
    
}
