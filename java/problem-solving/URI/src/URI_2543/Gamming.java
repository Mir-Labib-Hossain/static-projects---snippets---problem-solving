package URI_2543;
import java.util.Scanner;
public class Gamming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n2, s, s2;
        int i,c=0;
        while(sc.hasNextInt())
        {
            n = sc.nextInt();
            s = sc.nextInt();
            for(i=0; i<n; i++)
            {
                 s2 = sc.nextInt();
                 n2 = sc.nextInt();
                 if(s2==s && n2 == 0)
                     c++;
            }
            System.out.println(c);
            c=0;
        }
    }
}
