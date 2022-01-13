package URI_2554;
import java.util.Scanner;
public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int a = sc.nextInt();
            int f=0;
            int b = sc.nextInt();
            sc.nextLine();
            int t=0;
            String ans="";
            for(int i=0; i<b; i++)
            {
                String s = sc.nextLine();
                String srr[] = s.split(" ");
                for(int j=0; j<a; j++)
                {
                    if(!srr[j+1].equals("1"))
                        f=1;
                }
                if(f==0 && t==0)
                {
                    ans = srr[0];
                    t=1;
                }
                f=0;
            }
            if(t==0)
                System.out.println("Pizza antes de FdI");
            else
                System.out.println(ans);
        }
    }
}