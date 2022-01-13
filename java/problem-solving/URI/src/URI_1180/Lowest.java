package URI_1180;
import java.util.Scanner;
public class Lowest {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int N = obj.nextInt();
        int X[] = new int [N];
        int lowest = 0;
        int position = 0;
        for(int i=0; i<N; i++)
        {
            X[i] = obj.nextInt();
            if(i==0)
                lowest=X[i];
            if(lowest>X[i])
            {
                    lowest=X[i];
                    position = i;
            }
        }
        System.out.println("Menor valor: "+lowest);
        System.out.println("Posicao: "+position);
    }
}
