package URI_1070;
import java.util.Scanner;
public class SixOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        int count =0;
        while(count!=6)
        {
            if(X%2!=0)
            {
                System.out.println(X);
                count++;
            }
            X++;  
        }
    }
}