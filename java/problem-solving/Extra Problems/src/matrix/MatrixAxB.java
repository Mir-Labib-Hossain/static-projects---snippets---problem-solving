package matrix;
import java.util.Scanner;
public class MatrixAxB {
    public static void main(String[] matrix1Rowgs) {
    Scanner scanner = new Scanner (System.in);
       System.out.print("Enter number of Row for Matrix A : ");
        int matrix1Row = scanner.nextInt();
        System.out.print("Enter number of Colum for Matrix A : ");
        int matrix1Column = scanner.nextInt();
        System.out.print("Enter number of Row for Matrix B : ");
        int matrix2Row = scanner.nextInt();
        System.out.print("Enter number of Colum for Matrix B : ");
        int matrix2Column = scanner.nextInt();
        if(matrix1Column == matrix2Row)
        {
            int matrix1[][]=new int[matrix1Row][matrix1Column];
            int matrix2[][]=new int[matrix2Row][matrix2Column];
            int matrix3[][]=new int[matrix1Row][matrix2Column];
            System.out.println("Enter elements for matrix 'A' :");
            for(int i = 0; i < matrix1Row; i++)
            {
                for(int j = 0; j < matrix1Column; j++)
                {
                    System.out.print("A" +(i + 1)+ "" +(j + 1)+ " : ");
                    matrix1[i][j] = scanner.nextInt();  
                }
            }
            System.out.println("Enter elements for matrix 'B' :");
            for(int i = 0; i < matrix2Row; i++)
            {
                for(int j = 0; j < matrix2Column; j++)
                {
                    System.out.print("B"+(i + 1)+""+(j + 1)+" : ");
                    matrix2[i][j]=scanner.nextInt();  
                }
            }
            System.out.println("");
            System.out.println("A x B = ");
            for(int i = 0; i < matrix1Row; i++)
            {
                for(int j = 0; j < matrix2Column; j++)
                {
                    for(int k = 0; k < matrix1Column; k++)
                    {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                    System.out.print(matrix3[i][j]+"\t");
                }
                System.out.println("");
            }           
        }
        else
        {
            System.out.println("It cant be Multiplied");
        }
    }
}
