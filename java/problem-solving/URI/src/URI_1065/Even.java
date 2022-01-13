package URI_1065;
import java.util.Scanner;
public class Even {
public static void main(String[]args)
{
    Scanner obj = new Scanner(System.in);
    double a=0;
    int count=0;
    for(int i=0; i<5; i++)
    {
        a=obj.nextDouble();
        if(a%2==0)
        {
            count++;
        }
        a=0;
    }
    System.out.println(count+" valores pares");
}
}
