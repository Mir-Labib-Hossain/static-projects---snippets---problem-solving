package matrix;
import java.util.Scanner;
public class MatrixSumOfColumRow {
public static void main(String[] args) {
        Scanner labib = new Scanner(System.in);
        System.out.print("Enter Row number : ");
        int r= labib.nextInt();
        System.out.print("Enter Colum number : ");
        int c= labib.nextInt();
        int a[][] = new int[r][c];
        for(int i =0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print("A"+(i+1)+""+(j+1)+" : ");
                a[i][j]=labib.nextInt();
            }
        }
        System.out.println("");
        for(int i =0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("");
        int sumr =0,sumc=0,f=1;
        for(int i =0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                sumr+= a[i][j];
                sumc+= a[j][i];
            }
            System.out.println("Sum of Row "+f+" : "+sumr);
            System.out.println("Sum of Colum "+f+" : "+sumc);
            f++;
            sumr=0;
            sumc=0;
        }
    }
    
}
