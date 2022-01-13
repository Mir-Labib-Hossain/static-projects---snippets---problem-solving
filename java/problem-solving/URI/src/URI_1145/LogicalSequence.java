package URI_1145;
import java.util.Scanner;
public class LogicalSequence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        int Y = obj.nextInt();
        for(int i=1; i<=Y; i++)
        {
            System.out.print(i);
            if(i%X==0)
                System.out.println();
            else
            System.out.print(" ");
        }
    }
    
}
