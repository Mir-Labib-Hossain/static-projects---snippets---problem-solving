package URI_2152;
import java.util.Scanner;
public class Pape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int h, m, o;
        for(int i=0; i<test; i++)
        {
            h = sc.nextInt();
            m = sc.nextInt();
            o = sc.nextInt();
            if(String.valueOf(h).length()==1)
                System.out.print("0"+h+":");
            else
                System.out.print(h+":");
            if(String.valueOf(m).length()==1)
                System.out.print("0"+m+" - ");
            else
                System.out.print(m+" - ");
            if(o == 1)
                System.out.println("A porta abriu!");
            else
                System.out.println("A porta fechou!");
        }
    }
    
}
