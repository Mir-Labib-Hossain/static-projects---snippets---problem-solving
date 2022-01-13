package URI_1985;
import java.util.Scanner;
public class MacPRONALTS {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int i;
        int code;
        int amount;
        double ans = 0;
        for(i=0; i<n; i++)
        {
            code = obj.nextInt();
            amount = obj.nextInt();
            if(code == 1001)
                ans+=amount*1.50;
            else if(code == 1002)
                ans+=amount*2.50;
            else if(code == 1003)
                ans+=amount*3.50;
            else if(code == 1004)
                ans+=amount*4.50;
            else if(code == 1005)
                ans+=amount*5.50;
        }
        System.out.println(String.format("%.2f",ans));
    }
}
