package array;
import java.util.Scanner;
public class ArrayEvenOdd {
    public static void main(String[] args) {
Scanner labib = new Scanner (System.in);
        System.out.println("Enter array length : ");
        int l = labib.nextInt();
        System.out.println("Enter "+l+" inteager number : ");
        int a[]= new int[l];
        for(int i=0; i<l; i++)
        {
            a[i]=labib.nextInt();
        }
        System.out.println("Even numbers : ");
        for(int i=0; i<l; i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]+"\t");
            }
        }
        
        System.out.println("Odd numbers : ");
        for(int i=0; i<l; i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]+"\t");
            }
        }
    }
    
}
