package URI_2685;

import java.util.Scanner;

public class Change {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        while(scanner.hasNext())
        {
            n=scanner.nextInt();
            if(n<90 || n==360)
                System.out.println("Bom Dia!!");
            else if(n>=90 && n<180)
                System.out.println("Boa Tarde!!");
            else if(n>=180 && n<270)
                System.out.println("Boa Noite!!");
            else
                System.out.println("De Madrugada!!");
        }
    }
}
