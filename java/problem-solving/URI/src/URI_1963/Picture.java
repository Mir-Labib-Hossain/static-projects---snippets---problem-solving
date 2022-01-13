package URI_1963;
import java.util.Scanner;
public class Picture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = b/a;
        
        System.out.println(String.format("%.2f",c*100-100)+"%");
    }
    
}
