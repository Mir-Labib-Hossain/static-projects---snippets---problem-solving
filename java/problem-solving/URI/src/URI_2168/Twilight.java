package URI_2168;
import java.util.Scanner;
public class Twilight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        int[] arr[] = new int[n+1][n+1];
        for(i=0; i<=n; i++)
        {
            for(j=0; j<=n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(arr[i][j]==1 && (arr[i][j+1]==1 || arr[i+1][j+1]==1 || arr[i+1][j]==1))
                    System.out.print("S");
                else if(arr[i][j+1]==1 && (arr[i][j]==1  || arr[i+1][j+1]==1 || arr[i+1][j]==1))
                    System.out.print("S");
                else if(arr[i+1][j+1]==1 && (arr[i][j]==1  || arr[i][j+1]==1 || arr[i+1][j]==1))
                    System.out.print("S");
                else if(arr[i+1][j]==1 && (arr[i][j]==1  || arr[i][j+1]==1 ||arr[i+1][j+1]==1))
                    System.out.print("S");
                else
                    System.out.print("U");
            }
            System.out.println();
        }
    }
    
}