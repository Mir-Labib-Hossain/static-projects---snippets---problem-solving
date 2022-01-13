package array;
import java.util.Scanner;
public class ArrayDuplicateRemoved {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[10];
        int f=0;
        for(int i=0; i<10; i++)
            arr[i]=obj.nextInt();
        
        for(int i=0; i<10; i++)
        {
            f=0;
            for(int j=0; j<10; j++)
            {
                if(i!=j && arr[i]==arr[j])
                    f=1;
            }
            if(f==0)
                System.out.print(arr[i]+" ");
        }
        
    }
    
}
