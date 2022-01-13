package URI_1116;
import java.util.Scanner;
public class DividingXY {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        while(N!=0)
        {
            try{
            int X=obj.nextInt();
            int Y=obj.nextInt();
            float ans =X/Y;
                System.out.println((float)X/Y);
            }
            catch(Exception e)
            {
                System.out.println("divisao impossivel");
            }
            N--;
        }
    }
    
}
