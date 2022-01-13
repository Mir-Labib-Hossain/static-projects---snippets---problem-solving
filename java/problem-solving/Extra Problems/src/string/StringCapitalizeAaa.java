package string;
import java.util.Scanner;
public class StringCapitalizeAaa {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Line : ");
        String input = obj.nextLine();
        char arr[] = input.toCharArray();
        if(arr[0]!=' ')
            arr[0]=(char)(arr[0]-32);
        for(int i=0; i<arr.length; i++)
        {
           if(arr[i]==' ')
               arr[i+1]=(char)(arr[i+1]-32);
        }
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]);
    }
    
}
