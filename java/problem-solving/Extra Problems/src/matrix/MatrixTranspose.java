package matrix;
import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {
Scanner labib = new Scanner(System.in);
        System.out.println("Enter elements of matrix A :");
        int [][]a = new int[3][3];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print("A"+(i+1)+""+(j+1)+" ");
                a[i][j]=labib.nextInt();
            }
        }
        int t=0;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
        
    }
    
}
