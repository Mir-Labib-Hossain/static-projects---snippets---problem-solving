package URI_2523;
import java.util.Scanner;
public class Will {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            String ans ="";
            int n = sc.nextInt();
            for(int i=0; i<n; i++)
            {
                int a = sc.nextInt();
                ans+=s.charAt(a-1);
            }
            System.out.println(ans);
            sc.nextLine();
        }   
    }
}
