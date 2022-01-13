package string;
import java.util.Arrays;
import java.util.Scanner;
public class StringAnagramCompare {
    public static void main(String[] args) {
Scanner labib = new Scanner(System.in);
        System.out.println("Enter 1st String of charecter : ");
        String n1 = labib.nextLine();
        System.out.println("Enter 1st String of charecter : ");
        String n2 = labib.nextLine();
        
        int l = n1.length();
        if(l!=n2.length())
        {
            System.out.println("Its is not Anagram !");
            System.exit(0);
        }
        n1 = n1.toLowerCase();
        n2 = n2.toLowerCase();
        
        char ar1[] = n1.toCharArray();
        char ar2[] = n2.toCharArray();
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        int f=0;
        
        for(int i=0; i<l; i++)
        {
            f=0;
            if(ar1[i] != ar2[i])
            {   
                f=1;
            }
        }

        if(f==0)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
          
    }
}
