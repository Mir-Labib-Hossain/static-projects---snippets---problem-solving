package URI_1073;
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        for(int i=2; i<=N; i++)
        {
            if(i%2==0)
                System.out.println(i+"^2 = "+(i*i));
        }
    }
    
}
