package URI_1060;
import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[]args)
    {  
Scanner obj = new Scanner(System.in);    
int count=0;
double a=0;
for(int i=0; i<6; i++)
{
    a=obj.nextDouble();
    if(a>0)
        count++;
    
}
        System.out.println(count+" valores positivos");
}
}
