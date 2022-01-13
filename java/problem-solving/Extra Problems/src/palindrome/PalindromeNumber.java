package palindrome;
import java.util.Scanner;
public class PalindromeNumber {
     public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        System.out.println("Enter a number : ");
        String x = labib.nextLine();   
        int l = x.length();
        int a=0,b=0,f=1;
        for(int i = 0; i<=l/2; i++)
        {
            a = (int)(x.charAt(i)-48);
             b = (int)(x.charAt(l-1)-48);
             if(a!=b)
            {
                f=0;
                break ;
            }
            l--;
        }
        if(f==0)
            System.out.println(x+" is not palindrone");
        else
            System.out.println(x+" is palindrone");
     }
}