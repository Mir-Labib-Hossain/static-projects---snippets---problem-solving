package URI_1961;
import java.util.Scanner;
public class Frog {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int jump = obj.nextInt();
        int pipe = obj.nextInt();
        int i, j, k=0, f=0;
            k=obj.nextInt();
            j=k;
             if(k-j>jump || j-k>jump)
                f=1;
        for(i=1; i<pipe; i++)
        {
            k=obj.nextInt();
            if(k-j>jump || j-k>jump)
                f=1;
            j=k;
        }
        if(f==0)
            System.out.println("YOU WIN");
        else
            System.out.println("GAME OVER");
    }
}
