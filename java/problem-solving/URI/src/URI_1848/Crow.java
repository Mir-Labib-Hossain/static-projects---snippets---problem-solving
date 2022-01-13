package URI_1848;
import java.util.Scanner;
public class Crow {
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);   
     byte i=0;
     int ans=0;
     String input1=null;
     while(i!=3)
     {
         input1 = obj.nextLine();
         if(input1.charAt(0)=='*')
             ans+=4;
         if(input1.charAt(1)=='*')
             ans+=2;
         if(input1.charAt(2)=='*')
             ans+=1;
         else if(input1.charAt(0)=='c')
         {
            i++;
            System.out.println(ans);
            ans=0;
         }
     }
    }
}
