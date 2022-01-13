package URI_1984;
import java.util.Scanner;
public class Puzzle {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        char c[] = input.toCharArray();
        int i;
        int l=c.length-1;
        for(i=l; i>=0; i--)
            System.out.print(c[i]);
        System.out.println();
    }
    
}
