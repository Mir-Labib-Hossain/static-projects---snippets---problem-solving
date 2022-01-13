package URI_1175;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N[] = new int[20];
        int t=0;
        int i = 20;
        int a=1;
        while(i!=0)
        {
            i--;
            N[i]=obj.nextInt();
        }
        for(i=0; i<20; i++)
            System.out.println("N["+i+"] = "+N[i]);
    }
    
}
