package URI_2146;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNextInt())
        {
            n = sc.nextInt();
            System.out.println(n-1);
        }
    }   
}
