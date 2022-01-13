package URI_1957;
import java.util.Scanner;
public class Hexa {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      int decimal = obj.nextInt();
      int hexa;
      String ans="";
      while(decimal!=0)
      {
         hexa = decimal % 16;
         decimal = decimal / 16;
         if(hexa==10)
              ans+="A";
         else if(hexa==11)
              ans+="B";
         else if(hexa==12)
              ans+="C";
         else if(hexa==13)
              ans+="D";
         else if(hexa==14)
              ans+="E";
         else if(hexa==15)
              ans+="F";
         else
          ans+=hexa;
      }
        for(int i=ans.length()-1; i>=0; i--)
            System.out.print(ans.charAt(i));
        System.out.println();
    }
    
}
