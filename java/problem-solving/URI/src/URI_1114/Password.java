package URI_1114;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String ans = "2002";
        while(1==1)
        {
        String pass = obj.nextLine();
        if(ans.equals(pass))
        {
           System.out.println("Acesso Permitido");
           System.exit(0);
        }
        else
            System.out.println("Senha Invalida");
        }
    }
}
