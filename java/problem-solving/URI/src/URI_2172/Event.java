package URI_2172;
import java.util.Scanner;
public class Event {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long l;
        while(true)
        {
            n=sc.nextInt();
            l=sc.nextLong();
            if(n==0 && l==0)
                break;
            System.out.println(n*l);
        }
    }
    
}
