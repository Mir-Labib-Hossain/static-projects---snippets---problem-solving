
package URI_2542;
import java.util.Scanner;
public class LuDiOh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, md, ld, i, j, mc, lc, nc; //c = chosen
        while(scanner.hasNext()){
            n = scanner.nextInt();
            md = scanner.nextInt();
            ld = scanner.nextInt();
            int[][] ma = new int[n][md]; 
            int[][] la = new int[n][ld]; 
            for(i=0; i<md; i++)
            {
                for(j=0; j<n; j++)
                {
                    ma[j][i] = scanner.nextInt();
                }
            }
            for(i=0; i<ld; i++)
            {
                for(j=0; j<n; j++)
                {
                    la[j][i] = scanner.nextInt();
                }
            }
            mc = scanner.nextInt();
            lc = scanner.nextInt();
            nc = scanner.nextInt();
            if(ma[nc-1][mc-1] == la[nc-1][lc-1]){
                System.out.println("Empate");
            }
            else if(ma[nc-1][mc-1] > la[nc-1][lc-1]){
                System.out.println("Marcos");
            }
            else{
                System.out.println("Leonardo");
            }
        }
    }
}