package URI_1154;
import java.util.Scanner;
public class Ages {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int count=0;
        float ans=0;
        while(1==1)
        {
            int a = obj.nextInt();
            if(a<0)
                break;
            ans+=a;
            count++;
        }
        System.out.println(String.format("%.2f",(float)(ans/count)));
    }
}
