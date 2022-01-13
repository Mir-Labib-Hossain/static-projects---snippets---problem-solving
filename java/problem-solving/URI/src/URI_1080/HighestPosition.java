package URI_1080;
import java.util.Scanner;
public class HighestPosition {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        int a =0,b=0,pos=0;
        for (int i = 1; i<=100; i++)
        {
            a=obj.nextInt();
            if(a>b)
            {
                pos=i;
                b=a;
            }
        }
        System.out.println(b);
        System.out.println(pos);
    }   
}
