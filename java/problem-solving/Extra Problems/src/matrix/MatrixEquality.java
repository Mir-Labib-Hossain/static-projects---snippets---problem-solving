package matrix;
import java.util.Scanner;
public class MatrixEquality {
    public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        System.out.print("Enter aray 'n' : ");
        int l = labib.nextByte();
        int a[][]=new int[l][l];
        int c=0;
        for (int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
            System.out.print("A"+(i+1)+""+(j+1)+" : ");
            a[i][j]=labib.nextInt();
            }
        }
        System.out.println("");
        int b[][]=new int[l][l];
        for (int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
            System.out.print("B"+(i+1)+""+(j+1)+" : ");
            b[i][j]=labib.nextInt();
            if(a[i][j]==b[i][j])
            {
                c++;
            }
            }
        }
        if(c==l*l)
        {
            System.out.println("Matrix 'A' & 'B' is equal.");
        }
        else
            System.out.println("Matrix 'A' & 'B' is not equal.");
    }
    
}
