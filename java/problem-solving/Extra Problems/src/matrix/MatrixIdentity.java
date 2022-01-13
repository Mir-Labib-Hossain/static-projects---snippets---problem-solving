package matrix;
import java.util.Scanner;
public class MatrixIdentity {
    public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        System.out.println("Enter  size 'n' (A[nxn]) :");
        int l = labib.nextInt();
        System.out.println("Enter a matrix 'A' :");
        int [][]a = new int[l][l];
        int c=0;
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
                a[i][j]=labib.nextInt();
            }
        }
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
                System.out.print(a[i][j]+" ");
                if((i==j && a[i][j]==1) || (i!=j && a[i][j]==0))
                {
                    c++;
                }
            }
            System.out.println("    ");
        }
        if(c==(l*l))
        System.out.println(" is Identity matrix");
        else
            System.out.println("Not Indentity matrix");
    }
    
}
