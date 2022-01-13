package URI_1095;
import java.util.Scanner;
public class Sequence1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int I=-2, J=65;
        while(J!=0)
        {
            I+=3;
            J-=5;
            System.out.println("I="+I+" J="+J);
        }
    } 
}
