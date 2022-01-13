package URI_2164;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println( String.format("%.1f", (( Math.pow ( ((1+Math.sqrt(5))/2), a) - Math.pow( ((1-Math.sqrt(5))/2), a)) / Math.sqrt(5)) ) );
    }
    
}
