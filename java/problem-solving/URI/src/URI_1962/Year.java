package URI_1962;
import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int test = input.nextInt();
            int a;
            for(int i=0; i<test; i++)
            {
                a = input.nextInt();
                if(a<2015)
                    System.out.println(2015-a+" D.C.");
                else
                    System.out.println(a-2014+" A.C.");
            }
    }
    
}
