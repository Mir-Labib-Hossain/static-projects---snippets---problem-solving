package bouble_sort2;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array size ");
        int l = obj.nextInt();
        int[] a=new int[l];
        System.out.println("Enter "+l+" elements : ");
        for(int i=0; i<l; i++)
        {
            a[i]=obj.nextInt();
        }
        Sort s = new Sort();
        s.getarr(a,l);
    }  
}
