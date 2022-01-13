package matrix;
import java.util.Scanner;
public class MatrixTriangulerHiLo {
    public static void main(String[] args) {
        Scanner labib = new Scanner(System.in);
        System.out.println("Enter the type of Triangle Matrix :\nPress 1 for Hi :\nPress 2 for Lo :");
        int type = labib.nextInt();
       if( type !=1 & type != 2)
        {
        System.out.println("Wrong.\nYou should enter  1 or 2 ! ");
        System.exit(0);
        }
        System.out.println("Enter number of Colum or Row : ");
        int l = labib.nextInt();
        int a[][]=new int[l][l];
        int k=0;
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
                System.out.print("A"+(i+1)+""+(j+1)+" : ");
                a[i][j]=labib.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Matrix is : ");
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
                a[i][j]=++k;
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    if(type==2)
    {
        int c=0;
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
                if(c==1)
                {
                System.out.print("0  ");
                }
                else{
                System.out.print(a[i][j]+"  ");
                }
                if(i==j)
                {
                c=1;    
                }
            }
            System.out.println("");
            c=0;
        }
    }
    else if(type == 1)
    {
        int c=0;
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
                
                if(i==j)
                {
                c=1;    
                }
                if(c==0)
                {
                System.out.print("0  ");
                }
                else{
                System.out.print(a[i][j]+"  ");
                }
            }
            System.out.println("");
            c=0;
        }
    }
  }  
}
