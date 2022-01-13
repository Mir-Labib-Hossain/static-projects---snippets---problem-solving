package URI_1188;
import java.util.Scanner;
public class Inferno {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char O = obj.next().charAt(0);
        double M[][] = new double[12][12];
        double sum=0;
        int count=-1;
        for(int i=0; i<12; i++)
        {
            for(int j=0; j<12; j++)
            {
                M[i][j]=obj.nextDouble();
                    if(i+j>=12 && i>j)
                    {
                        sum+=M[i][j];
                        count++;
                    }
            }
        }if(O=='S')
            System.out.println(String.format("%.1f",sum));
        if(O=='M')
            System.out.println(String.format("%.1f",(sum/count)));
        
    }
    
}
