package URI_2059;
import java.util.Scanner;
public class EOC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int j1 = sc.nextInt();
        int j2 = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();
        int f;
        if(( p==1 && (j1+j2)%2==0 ) || (p==0 && (j1+j2)%2!=0))
            f=1;
        else 
            f=0;
        if(r==1 && a==1)
            f=0;
        else if(r==1 && a==0)
            f=1;
        else if(r==0 && a==1)
            f=1;
        if(f==1)
            System.out.println("Jogador 1 ganha!");
        else
            System.out.println("Jogador 2 ganha!");
        
    }
    
}
