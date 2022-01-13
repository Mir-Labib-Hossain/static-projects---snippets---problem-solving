package URI_2551;
import java.util.Scanner;
public class NewRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {   
            int n = sc.nextInt();
            int f=0;
            double arr[] = new double[n];
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[0]=(double)b/a;
            System.out.println("1");
            for(int i=1; i<n; i++)
            {
                a = sc.nextInt();
                b = sc.nextInt();
                arr[i] = (double)b/a;
                f=0;
                for(int j=0; j<i; j++)
                {
                    if(arr[j]>=(double)b/a)
                        f=1;
                }
                if(f==0)
                    System.out.println((i+1));
            }
        }
    }
}
