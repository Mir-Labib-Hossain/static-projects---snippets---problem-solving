package duplicate_number;
import java.util.Scanner;
public class DuplicateNumber {
    public static void main(String[] args) {
Scanner labib = new Scanner(System.in);
        System.out.println("Enter the array length :");
        int l = labib.nextInt();
        System.out.println("Enter "+l+" element :");
        int a[]= new int[l];
        int[] n = new int[100];
        int c=0;
        for(int i =0; i<l; i++) 
        {
            a[i] =labib.nextInt();
        }
        System.out.println("\nDuplicate of nubers are :");
        for(int i=0; i<l; i++)
        {
        for(int j=0; j<l; j++)
        {
            if(i!=j)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                break;
                }
            }
        }
        }
    }
}
