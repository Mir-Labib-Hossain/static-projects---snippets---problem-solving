package string;
import java.util.Scanner;
public class StringSubSet {
    public static void main(String[] args) {
Scanner labib = new Scanner(System.in);
        System.out.println("Enter a char type String : ");
        String s = labib.nextLine();
        int l = s.length();
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println("");
            for(int k=l-1; k>i; k--)
            {
               System.out.print(s.charAt(k)); 
            }
            System.out.println("");
        }
    }
    
}
