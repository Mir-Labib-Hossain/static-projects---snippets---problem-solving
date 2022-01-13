package URI_1564;
import java.util.Scanner;
public class Brazil {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        byte N =0;
        while(obj.hasNext())
        {
            N=obj.nextByte();
            if(N==0)
                System.out.println("vai ter copa!");
            else
                System.out.println("vai ter duas!");
        }
    }
    
}
