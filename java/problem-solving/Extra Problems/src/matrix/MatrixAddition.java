package matrix;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
Scanner labib = new Scanner(System.in);
        System.out.println("Enter matrix A :");
        int a[][] = new int[3][3];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print("\tA"+(i+1)+""+(j+1)+" : ");
                a[i][j]=labib.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Enter matrix B :");
        int b[][] = new int[3][3];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print("\tB"+(i+1)+""+(j+1)+" : ");
                b[i][j]=labib.nextInt();
            }
            System.out.println("");
        }
        System.out.println("A + B = ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                   System.out.print((a[i][j]=a[i][j]+b[i][j])+"\t");
            }
            System.out.println("");
        }
        
    }
    
}
