package URI_2006;
import java.util.Scanner;
public class Tea {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        int a;
        byte b = 0;
        for(int i=0; i<5; i++)
        {
            a = obj.nextInt();
            if(a==t)
                b++;
        }
        System.out.println(b);
    }
}
