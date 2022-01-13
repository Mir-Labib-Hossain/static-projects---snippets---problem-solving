package URI_1051;
import java.util.Scanner;
public class Taxes {
public static void main(String [] args)
{
    Scanner obj = new Scanner(System.in);
    double sal = obj.nextDouble();
    double ans = 0,s28=0 ,s18=0, s8=0;
    if(sal>=0.00 && sal<=2000.00)
    {
        System.out.println("Isento");
        System.exit(0);
    }
    else if(2000.00<sal)
    {
        if(sal>4500.00)
        {
            s28 = sal - 4500.00;
            s18 = sal - 3000.00 - s28;
            s8 = sal - 2000.00 - s28 - s18;
        }
        else if(sal>=3000.01 && sal<=4500.00)
        {
            s18 = sal - 3000.00;
            s8 = sal - 2000.00 - s18;
        }
        else if(sal>=2000.01 && sal<=3000.00)
        {
            s8 = sal - 2000.00;
        }
        ans = (s8*8/100)+(s18*18/100)+(s28*28/100);
        System.out.println("R$ "+String.format("%.2f",ans));
    }
}
}
