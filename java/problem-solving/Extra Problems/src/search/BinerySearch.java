package search;

import java.util.Scanner;

public class BinerySearch {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number of elements you eanna enter :");
        int l = obj.nextInt();
        System.out.println("Enter " +l+ " inteager Elements");
        int[] a = new int[l];
        for(int i = 0; i < l; i++)
        {
            a[i] = obj.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l - 1; j++)
            {
                if(a[j] > a[j + 1])
                {
                   temp = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int i = 0; i < l; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println("\nEnter the number you wanna search : ");
        int s = obj.nextInt();
        int mid = 0, hi = l, lo = 1, c = 0;
        for(int i = 0; i < l; i++)
        {
            mid = (hi + lo) / 2;
            if(s < a[mid])
            {
                hi = mid - 1;
            }
            else if(a[mid] < s)
            {
                lo = mid + 1;
            }
            else if( a[mid] == s)
            {
                c=1;
                System.out.println( s + " is at " + mid + " index");
                break;
            }
        }
        if(c==0)
        {
            System.out.println(s + " is not in Array");
        }
    }
}
