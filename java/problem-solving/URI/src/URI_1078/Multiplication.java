package URI_1078;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(i+" x "+N+" = "+(i*N));
        }
    }   
}
