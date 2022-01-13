package armstrongnumber;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int input, temp, a = 0, c = 0;
    input = scanner.nextInt();
    temp = input;
        while(input!=0)
        {
            a = input%10;
            input = input/10;
            c += Math.pow(a,3);
        }
        if(temp == c)
            System.out.println(temp+ " is Armstrong number !");
        else
            System.out.println(temp+ " is not Armstrong number !");
    }
}