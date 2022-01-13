package URI_1182;
import java.util.Scanner;
public class Colum {
    public static void main(String[] args) {
              Scanner obj = new Scanner(System.in);
        int L = obj.nextInt();
        char T = obj.next().charAt(0);
        double M[][] = new double[12][12];
        double sum =0;
        for(int i=0; i<12; i++)
        {
            for(int j=0; j<12; j++)
            {
                M[i][j]=obj.nextDouble();
                if(L==j)
                    sum+=M[i][j];
            }
        }
        if(T=='S')
            System.out.println(String.format("%.1f", sum));
        if(T=='M')
            System.out.println(String.format("%.1f", sum/12));
    }
    
}
