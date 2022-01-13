package URI_1864;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String quote = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        byte input = obj.nextByte();
        byte i=0;
        for(i=0; i<input; i++)
            System.out.print(quote.charAt(i));
        System.out.println();
    }   
}
