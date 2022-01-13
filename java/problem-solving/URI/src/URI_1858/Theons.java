package URI_1858;
import java.util.Scanner;
public class Theons {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int test = obj.nextInt();
        int hit[] = new int[test];
        int ans=0;
        
        for(int i=0; i<test; i++)
            hit[i] = obj.nextInt();
        
        for(int i=0; i<test; i++)
        {
            if(hit[i]==0)
                    continue;
            for(int j=0; j<test; j++)
            {
               if(i!=j)
               {
                   if(hit[i]==hit[j])
                       hit[j]=0;
               }
            }
        }
        for(int i=0; i<test; i++)
        {
            if(hit[i]!=0)
                ans++;
        }
        System.out.println(ans);
    }
    
}
