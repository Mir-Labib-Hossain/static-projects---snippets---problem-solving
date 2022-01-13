package URI_1134;
import java.util.Scanner;
public class Fuel {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a=0, g=0, d=0;
        while(1==1)
        {
            int x =obj.nextInt();
            if(x==1)
                a++;
            else if(x==2)
                g++;
            else if(x==3)
                d++;
            else if(x==4)
                break;
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+d);
    }
    
}
