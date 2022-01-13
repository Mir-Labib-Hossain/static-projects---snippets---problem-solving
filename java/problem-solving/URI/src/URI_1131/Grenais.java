package URI_1131;
import java.util.Scanner;
public class Grenais {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int X = 0, gg=0, ig=0, count=0, draw=0;
            while(1==1)
            {   
                count++;
                int i = obj.nextInt();
                int g = obj.nextInt();
                if(i>g)
                    ig++;
                else if(i<g)
                    gg++;
                else if(i==g)
                    draw++;
                System.out.println("Novo grenal (1-sim 2-nao)");
                X=obj.nextInt();
                if(X==2)
                    break;
            }
        System.out.println(count+" grenais");
        System.out.println("Inter:"+ig);
        System.out.println("Gremio:"+gg);
        System.out.println("Empates:"+draw);
        if(ig>gg)
            System.out.println("Inter venceu mais");
        else
            System.out.println("Gremio venceu mais");
    }
    
}
