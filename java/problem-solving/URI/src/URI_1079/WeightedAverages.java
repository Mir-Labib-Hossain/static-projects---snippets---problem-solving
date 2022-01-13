package URI_1079;
import java.util.Scanner;
public class WeightedAverages {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        double a=0, b=0, c=0;
        double[] ans = new double[N];
        for(int i=0; i<N; i++)
        {
            a=obj.nextDouble();
            b=obj.nextDouble();
            c=obj.nextDouble();
            ans[i] = ((a*2)+(b*3)+(c*5))/10;
        }
        for(double i:ans)
        System.out.println(String.format("%.1f",i));  
    }
}
