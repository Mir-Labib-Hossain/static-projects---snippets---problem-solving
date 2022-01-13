package thread;
import java.util.Scanner;
public class Main {
     static void check(int a,int b) throws Exception
    {
        if((a>=40 && a<=100) && (b>=0 && b<=1500))
            System.out.println("Welcome to new class");
        else {
             if(a<40 && b>1500)
                throw new Exception("Not Allowed! Marks less than 40 and Dues greater than 1500");
            else if(a<40)
                throw new Exception("Not Allowed! Marks less than 40");
            else if(b>1500)
                throw new Exception("Not Allowed! Dues greater than 1500");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        check(a,b);
    }
}
