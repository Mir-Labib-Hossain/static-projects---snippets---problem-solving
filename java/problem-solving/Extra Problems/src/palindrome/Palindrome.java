package palindrome;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        System.out.println("Enter a word to is it PALINDROME or nah :");
        String word = labib.nextLine();
        int f=0;
        int length=word.length();
        int i=0, j=0;
        word = word.toUpperCase();
        for(i=0, j=length-1; i<length/2; i++,j--)
        {
            if(word.charAt(i)!=word.charAt(j))
                f=1;
        }
        if(f==0)
        {
            System.out.println(""+word+" is Palindrome");
        }
        else
        {
            System.out.println(""+word+" is not Palindrome");
        }
    }
    
}
