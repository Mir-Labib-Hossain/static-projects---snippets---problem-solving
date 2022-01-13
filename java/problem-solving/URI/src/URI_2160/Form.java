package URI_2160;
import java.util.Scanner;
public class Form {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        if(s.length()<=80)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
