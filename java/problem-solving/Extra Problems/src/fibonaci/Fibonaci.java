package fibonaci;
import java.util.Scanner;
public class Fibonaci
{
    public static void main(String []args)
    {
    Scanner labib = new Scanner (System.in);
    System.out.print("Enter a number : " );
    int x = labib.nextInt();
    int a =0, b=1;
    int c = a+b;;
    for(int i = 1; i<=x; i++){
        
        System.out.print(" "+a);
        a=b;
        b=c;
        c=a+b;
    }
    }
}