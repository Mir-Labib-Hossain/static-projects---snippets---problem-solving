package URI_1094;
import java.util.Scanner;
public class Experiments {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        double c=0, r=0, s=0;
        int  x=0 ,total=0;
        char y=0;
        for(int i=0; i<N; i++)
        {
            x=obj.nextInt();
            total+=x;
            y=obj.next().charAt(0);
            if(y=='C')
                c+=x;
            else if(y=='R')
                r+=x;
            else if(y=='S')
                s+=x;
        }
        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+(int)c);
        System.out.println("Total de ratos: "+(int)r);
        System.out.println("Total de sapos: "+(int)s);
        System.out.println("Percentual de coelhos: "+String.format("%.2f",(c*100)/total)+" %");
        System.out.println("Percentual de ratos: "+String.format("%.2f",(r*100)/total)+" %");
        System.out.println("Percentual de sapos: "+String.format("%.2f",(s*100)/total)+" %");
    }
    
}
