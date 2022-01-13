package URI_1789;
import java.util.Arrays;
import java.util.Scanner;
public class Race {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int L=0;
        int i=0;
        int t=0;
        int max=0;
        byte level =0;
        while(obj.hasNext())
        {
            L = obj.nextInt();
            int a[] = new int[L];
            for(i=0; i<L; i++)
            {
                a[i]=obj.nextInt();
            }
            Arrays.sort(a);
            if(a[L-1]<10)
                    System.out.println("1");
            else if(a[L-1] >=10 && a[L-1]<20)
                    System.out.println("2");
            else if(a[L-1]>=20)
                    System.out.println("3");
        }
    }   
}
