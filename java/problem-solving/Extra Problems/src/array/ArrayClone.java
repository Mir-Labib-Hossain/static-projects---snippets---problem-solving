package array;
import java.util.Scanner;
public class ArrayClone {
    public static void main(String[] args) {
    Scanner obj = new Scanner (System.in);
        System.out.println("Enter 1st Array size : ");
        int l = obj.nextInt();
        System.out.println("Enter "+l+" elements : ");
        int a[] = new int[l];
        for(int i=0; i<l; i++)
            a[i]=obj.nextInt();
        int b[] = a.clone();
        System.out.println("Cloned Array : ");
        for(int i:b)//=0; i<b.length; i++)
            System.out.print(i+" ");
        System.out.println("");
        System.out.println("Are they Equal ? ");
        System.out.println(a==b);
    }
    
}
