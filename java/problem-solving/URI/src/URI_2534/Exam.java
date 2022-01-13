package URI_2534;
import java.util.Arrays;
import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,i,j,t;
        while(sc.hasNextInt())
        {
            a = sc.nextInt();
            int arr[] = new int[a];
            b = sc.nextInt();
            int brr[] = new int[b];
            for(i=0; i<a; i++)
                arr[i]=sc.nextInt();
            for(i=0; i<b; i++)
                brr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(i=0, j=arr.length-1; i<a/2; i++,j--)
            {
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
            for(i=0; i<b; i++)
                System.out.println(arr[brr[i]-1]);
        }   
    }   
}
