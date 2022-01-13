package URI_2167;
import java.util.Scanner;
public class Engine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int arr[] = new int[test];
        int c=0;
        arr[0] = sc.nextInt();
        for(int i=1; i<test; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]<arr[i-1])
            {
                c=i;
                break;
            }
        }
        if(c!=0)
            System.out.println((c+1));
        else
            System.out.println("0");
    }
}
