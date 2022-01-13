package URI_1179;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int par[] = new int[5];
        int impar[] = new int[5];
            int count1=0;
            int count2=0;        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<5; j++)
            {
            int a = obj.nextInt();
            if(a%2==0)
            {
                par[count1]=a;
                count1++;
            }
            else
            {
                impar[count2]=a;
                count2++;
            }
            if(count1==5)
            {
                for(int p =0; p<5; p++)
                    System.out.println("par["+p+"] = "+par[p]);
                count1=0;
            }
            if(count2==5)
            {
                for(int p =0; p<5; p++)
                    System.out.println("impar["+p+"] = "+impar[p]);
                count2=0;
            }
            }
        }
         for(int p =0; p<count2; p++)
                    System.out.println("impar["+p+"] = "+impar[p]);
        for(int p =0; p<count1; p++)
                    System.out.println("par["+p+"] = "+par[p]);

    }
    
}
