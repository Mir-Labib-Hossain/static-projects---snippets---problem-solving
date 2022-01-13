package URI_2547;
import java.util.Scanner;
public class Roller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, l, h, g, i, c=0;
        while(sc.hasNextInt())
        {
            n = sc.nextInt();
            l = sc.nextInt();
            h = sc.nextInt();
            for(i=0; i<n; i++)
            {
                g = sc.nextInt();
                if(g>=l && g<=h)
                    c++;
            }
            System.out.println(c);
            c=0;
        }
    }  
}
