package URI_1478;
import java.util.Scanner;
public class Matrix2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        byte count;
        byte f;
        byte N;
        byte i=0;
        byte j=0;
        while(true)
        {
        N = obj.nextByte();
        if(N==0)
            break;
        else{
            for(i=1; i<=N; i++)
            {
                f=0;
                count = i;
                System.out.print(String.format("%3d",count));
                for(j=1; j<N; j++)
                {
                    if(i==j)
                        f=1;
                    if(f==1)
                        count++;
                    else
                        count--;
                    System.out.print(String.format("%4d",count));
                }
                System.out.println();
            }
            System.out.println();
        }
        }
    }
}