package URI_2311;
import java.util.Arrays;
import java.util.Scanner;
public class Diving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double l;
        String s;
        double arr[] = new double[7];
        for(int i=0; i<n; i++)
        {
              sc.nextLine();
            s=sc.nextLine();
            l=sc.nextDouble();
            for(int j=0; j<7; j++)
            {
                arr[j]=sc.nextDouble();
            }
            Arrays.sort(arr);
            System.out.print(s+" ");
            System.out.println( String.format("%.2f",(arr[1]+arr[2]+arr[3]+arr[4]+arr[5])*l) );            
        }  
    }
}
