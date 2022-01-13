package URI_2031;
import java.util.Scanner;
public class Rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int i;
        String p1;
        String p2;
        sc.nextLine();
        for(i=0; i<n; i++)
        {
             p1 = sc.nextLine();
             p2 = sc.nextLine();
             if(p1.equals("ataque") && p2.equals("pedra"))
                 System.out.println("Jogador 1 venceu");
             else if(p1.equals("pedra") && p2.equals("ataque"))
                 System.out.println("Jogador 2 venceu");
             else if(p1.equals("pedra") && p2.equals("papel"))
                 System.out.println("Jogador 1 venceu");
             else if(p1.equals("papel") && p2.equals("pedra"))
                 System.out.println("Jogador 2 venceu");
             else if(p1.equals("ataque") && p2.equals("papel"))
                 System.out.println("Jogador 1 venceu");
             else if(p1.equals("papel") && p2.equals("ataque"))
                 System.out.println("Jogador 2 venceu");
             else if(p1.equals("papel") && p2.equals("papel"))
                 System.out.println("Ambos venceram");
             else if(p1.equals("pedra") && p2.equals("pedra"))
                 System.out.println("Sem ganhador");
             else if(p1.equals("ataque") && p2.equals("ataque"))
                 System.out.println("Aniquilacao mutua");
             
        }
    }
}
