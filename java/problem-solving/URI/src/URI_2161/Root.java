package URI_2161;
import java.util.Scanner;
public class Root {
    public static void main(String[] args) {
        int n = 1;//new Scanner(System.in).nextInt();
        double ans=0;
        for(int i = 0; i<=n; i++){
            //ans = (3+(1/6.0));
            //ans = (3+(1/(6+(1/6.0))));2
              ans = (3+(1/(6+(1/(12+(1/12.0))))));
            //ans = (3+(1/(6+(1/(12+(1/24+(1/(48+(1/(double)48)))))))));
        }
        System.out.printf("%.10f\n",ans);
    }   
}
