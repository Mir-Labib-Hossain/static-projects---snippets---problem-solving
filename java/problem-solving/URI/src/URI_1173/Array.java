package URI_1173;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int V = obj.nextInt();
        int N[] = new int[10];
        for(int i=0; i<10; i++)
        {
            N[i]= V;
            V=V*2;            
        }
        for(int i=0; i<10; i++)
            System.out.println("N["+i+"] = "+N[i]);
    }   
}
