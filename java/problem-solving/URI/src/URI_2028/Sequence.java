package URI_2028;

import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
        int i;
        int j;
        int cas=0;
        int num;
        String ans;
        int input;
        while(obj.hasNext())
        {
            input = obj.nextInt();
            ans= "0";
            cas++;
            num = ((input * (input + 1)) / 2) + 1;
            System.out.println("Caso "+cas+": "+num+" numero"+((input!=0)?"s":""));
            System.out.print("0");
            for(i=1; i<=input; i++)
            {
                for(j=1; j<=i; j++)
                {
                    System.out.print(" "+i);
                }
            }
            
            System.out.println("\n");
        }
    }
}