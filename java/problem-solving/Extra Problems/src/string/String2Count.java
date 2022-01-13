package string;
import java.util.Scanner;
public class String2Count {
    public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        System.out.println("Enter your full name : ");
        String name = labib.nextLine();
        int l = name.length (),count =0,f=1;
        for(int i=0; i<l; i++)
        {
            if(name.charAt(i)==' ')
            {
                System.out.println(""+f+" Strint size : "+count);
                f++;
                count=0;
            }
            if(name.charAt(i)!=' ')
            ++count;
        }
        System.out.println(""+f+" Strint size : "+count);

        
    }
    
}
