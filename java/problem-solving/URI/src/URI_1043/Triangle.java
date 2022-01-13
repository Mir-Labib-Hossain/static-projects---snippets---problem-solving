package URI_1043;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        float A = o.nextFloat();
        float B = o.nextFloat();
        float C = o.nextFloat();
        if( ((A+B)>C) && ((B+C)>A) && ((C+A)>B))
        {
            System.out.println("Perimetro = "+(A+B+C));
        }
        else
        {
            System.out.println("Area = "+((A+B)*C)*.5);
        }
    }
    
}
