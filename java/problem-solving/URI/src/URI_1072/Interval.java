package URI_1072;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int X=0, in=0, out=0;
        for(int i=0; i<N; i++)
        {
            X=obj.nextInt();
            if(X>=10 && X<=20)
                in++;
            else
                out++;
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
    
}
