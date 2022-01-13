package URI_2310;
import java.util.Scanner;
public class VolleyBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double at,bt,ct;
        double as,bs,cs;
        double a=0, b=0 ,c=0;
        double aa=0, bb=0, cc=0; 
        String s;
        for(int i=0; i<n; i++)
        {
            s=sc.nextLine();
            sc.next();
            at = sc.nextDouble();
            bt = sc.nextDouble();
            ct = sc.nextDouble();
            as = sc.nextDouble();
            bs = sc.nextDouble();
            cs = sc.nextDouble();
            a+=at;
            b+=bt;
            c+=ct;
            aa+=as;
            bb+=bs;
            cc+=cs;
        }
        System.out.println("Pontos de Saque: "+String.format("%.2f",aa*100/a)+" %.");
        System.out.println("Pontos de Bloqueio: "+String.format("%.2f",bb*100/b)+" %.");
        System.out.println("Pontos de Ataque: "+String.format("%.2f",cc*100/c)+" %.");
    }
    
}
