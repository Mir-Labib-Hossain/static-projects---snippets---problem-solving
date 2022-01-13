package array;
import java.util.Scanner;
public class ArrayDuplicatePrint {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[10];
       
        for(int i=0; i<arr.length; i++)
            arr[i]=obj.nextInt();
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
                if(i!=j) 
                    if(arr[i]==arr[j])
                    arr[j]=0;
            if(arr[i]!=0)
                System.out.print(arr[i]+" ");
        }   
    }  
}
