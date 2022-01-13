package URI_2061;
import java.util.Scanner;
public class Tab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int i;
        String click;
        sc.nextLine();
        for(i = 0; i<n; i++)
        {
            click =  sc.nextLine();
            if(click.equals("fechou"))
                t++;
            else if(click.equals("clicou"))
                t--;
        }
        System.out.println(t);
    }
    
}

