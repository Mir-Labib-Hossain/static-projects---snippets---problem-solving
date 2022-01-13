package array;
import java.util.Scanner;
public class ArrayCopy {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array size :");
        int l = obj.nextInt();
        System.out.println("Enter "+l+" elements : ");
        int a[]=new int[l];
        for(int i=0; i<l; i++)
        {
            a[i]=obj.nextInt();
        }
        int b[]=new int[l];
        System.out.println("Enter Starting elements of new array : ");
        int a1 = obj.nextInt();
        System.arraycopy(a,a1,b,0,l-a1);
        int l2=b.length;
        System.out.println("Ans1 : ");
        for(int i:b)//=0; i<l2-a1; i++)
        System.out.print(i+" ");  
        System.out.println("Ans2 : ");
        for(int i=0; i<l2-a1; i++)
        System.out.print(i+" ");  
    
    }
    
}
