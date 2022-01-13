package URI_2162;
import java.util.Scanner;
public class Peaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
            if((i!=0 && arr[i]==arr[i-1]) || (i>=2 && ((arr[i-2]<arr[i-1] && arr[i-1]<arr[i]) || (arr[i-2]>arr[i-1] && arr[i-1]>arr[i]) )))
            {
                System.out.println("0");
                System.exit(0);
            }
        }
        System.out.println("1");
    }
}