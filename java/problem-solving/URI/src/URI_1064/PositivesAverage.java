package URI_1064;
import java.util.Scanner;
public class PositivesAverage {
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        double a=0;
        double ave=0;
        int count =0;
        for(int i=0; i<6; i++)
        {
            a=obj.nextDouble();
            if(a>0)
            {
                count++;
                ave+=a;
            }
            a=0;
        }
        ave=ave/count;
        System.out.println(count+" valores positivos");
        System.out.println(String.format("%.1f", ave));
    }
}
