package URI_1067;
import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        int X = obj.nextInt();
        for(int i=1; i<=X; i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }
    }
}
