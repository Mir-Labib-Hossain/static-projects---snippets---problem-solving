package URI_2176;
import java.util.Scanner;
public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i, count=0;
        int l=s.length();
        for(i=0; i<l; i++)
        {
            if(s.charAt(i)=='1')
                count++;
        }
        if(count%2==0)
            System.out.println(s+"0");
        else
            System.out.println(s+"1");
    }
}
