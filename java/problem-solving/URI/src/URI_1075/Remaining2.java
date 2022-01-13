package URI_1075;
import java.util.Scanner;
public class Remaining2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
      for(int i=1; i<10000; i++)
          if(i%N==2)
        System.out.println(i);    
    }
}
