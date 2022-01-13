package URI_1117;
import java.util.Scanner;
public class Score {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        int count=0;
        double ans = 0;
        while(count!=2)
        {
            double score =obj.nextDouble();
            if(score >= 0.0 && score <=10.0)
            {
                count++;
                ans+=score;
            }
            else
                System.out.println("nota invalida");
        }
        System.out.println("media = "+(ans/2));
    }
    
}
