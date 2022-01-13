package string;
import java.util.Scanner;
public class StringVowelConsonant {
    public static void main(String[] args) {
Scanner labib = new Scanner (System.in);
        System.out.println("Enter Sting of charecter : ");
        String c = labib.nextLine();
        int l =c.length();
        int countv = 0;
        int countc = 0;
        int counts = 0;
        for(int i=0; i<l; i++)
        {
            if(c.charAt(i)=='a' || c.charAt(i)=='e' || c.charAt(i)=='i' || c.charAt(i)=='o' || c.charAt(i)=='u')
            {
                countv++;
            }
            else if(c.charAt(i)==' ')
            {
                counts++;
            }
            else
            {
                countc++;
            }
        }
        System.out.println("Total Vowel : "+countv+"\nTotal Consonant : "+countc+"\nTotal Space : "+counts);
    }
    
}
