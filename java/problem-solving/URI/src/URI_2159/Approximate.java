package URI_2159;
import java.util.Scanner;
public class Approximate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(String.format("%.1f",n/Math.log(n))+" ");
        System.out.println(String.format("%.1f",1.25506*(n/Math.log(n))));
    } 
}
