package string;
import java.util.Scanner;
public class StringEqualDivide {
    public static void main(String[] args) {
Scanner labib = new Scanner(System.in);
        System.out.println("Enter a Char type String : ");
        String s = labib.nextLine();
        System.out.println("Enter the 'n'  value : ");
        int n= labib.nextInt();
        int l =s.length(),f=0;
        if (l%n==0)
        {
            for(int i=0; i<l/n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(s.charAt(f));   
                    f++;
                }
                System.out.println("");
            }
        }
    }
    
}
