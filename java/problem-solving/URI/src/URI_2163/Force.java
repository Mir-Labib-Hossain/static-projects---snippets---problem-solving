package URI_2163;
import java.util.Scanner;
public class Force {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int f=0, i=0, j=0;
        int arr[][] = new int[r][c];
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                if(arr[i][j]==42)
                {
                    try{
                    if((arr[i-1][j-1]==7) && (arr[i-1][j]==7) && (arr[i-1][j+1]==7) && (arr[i][j-1]==7) && (arr[i][j+1]==7) && (arr[i+1][j-1]==7) && (arr[i+1][j]==7) && (arr[i+1][j+1]==7))
                    {
                        f=1;
                        break;
                    }
                    }
                    catch(Exception e){
                        System.out.print("");
                    }
                }
            }
            if(f==1)
                break;
        }
        if(f==1)
            System.out.println((1+i)+" "+(j+1));
        else
            System.out.println("0 0");
    }
}