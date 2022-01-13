package URI_1185;
import java.util.Scanner;
public class AboveDialog {
    public static void main(String[] args) {
          Scanner obj = new Scanner(System.in);
        char O = obj.next().charAt(0);
        double M[][] = new double [12][12];
        int count=0;
        int f=0;
        double sum=0;
        for(int i =0; i<12; i++)
        {
            for(int j=0; j<12; j++)
            {
                M[i][j] = obj.nextDouble();
                if(i+j <= 10)
                {
                    sum+=M[i][j];
                    count++;
                }
            }
        }
        if(O=='S')
            System.out.println(String.format("%.1f",sum));
        if(O=='M')
            System.out.println(String.format("%.1f",(sum/count)));
    }   
}
