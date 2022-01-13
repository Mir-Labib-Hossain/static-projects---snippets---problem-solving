package URI_1828;
import java.util.Scanner;
public class Bazinga {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        String sheldon = null;
        String raj = null;
        String input = null;
        int i;
        obj.nextLine();
        for(i=1; i<=T; i++)
        {
            input = obj.nextLine();
            String arr[] = input.split(" ");
            sheldon = arr[0];
            raj = arr[1];
            if(sheldon.equals(raj))
                System.out.println("Caso #"+i+": De novo!");
            else if( ("tesoura".equals(sheldon) && "papel".equals(raj)) || ("papel".equals(sheldon) && "pedra".equals(raj)) || ("pedra".equals(sheldon) && "lagarto".equals(raj)) || ("lagarto".equals(sheldon) && "Spock".equals(raj)) || ("Spock".equals(sheldon) && "tesoura".equals(raj)) || ("tesoura".equals(sheldon) && "lagarto".equals(raj)) || ("lagarto".equals(sheldon) && "papel".equals(raj)) || ("papel".equals(sheldon) && "Spock".equals(raj)) || ("Spock".equals(sheldon) && "pedra".equals(raj)) || ("pedra".equals(sheldon) && "tesoura".equals(raj)) )
                System.out.println("Caso #"+i+": Bazinga!");
            else
                System.out.println("Caso #"+i+": Raj trapaceou!");
        }
            
    }
    
}
