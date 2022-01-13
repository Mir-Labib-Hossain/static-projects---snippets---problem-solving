package URI_1177;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        int []N = new int[1000];
        int count=0;
        while(1==1)
        {
            for(int i=0; i<T; i++)
            {
                System.out.println("N["+count+"] = "+i);
                count++;
                if(count==1000)
                    System.exit(0);
            }
        }
    }
    
}
