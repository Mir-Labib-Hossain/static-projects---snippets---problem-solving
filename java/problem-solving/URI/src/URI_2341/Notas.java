package URI_2341;

import java.util.Scanner;

/**
 *
 * @author Labib
 */
public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==0)
            System.out.println("E");
        else if(a>=1 && a<=35)
            System.out.println("D");
        else if(a>=36 && a<=60)
            System.out.println("C");
        else if(a>=61 && a<=85)
            System.out.println("B");
        else if(a>=86 && a<=100)
            System.out.println("A");
        
    }
    
}
