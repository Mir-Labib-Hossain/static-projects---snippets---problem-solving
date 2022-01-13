package URI_1066;
import java.util.Scanner;
public class EOPN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = 0;
        int even=0, odd=0, positive=0, negative=0;
        for(int i=0; i<5; i++)
        {
         a = obj.nextInt();
        if(a>0)
            positive++;
        if(a<0)
            negative++;
        if(a%2==0)
            even++;
        if(a%2!=0)
            odd++;
        }
            System.out.println(even+" valor(es) par(es)");
            System.out.println(odd+" valor(es) impar(es)");
            System.out.println(positive+" valor(es) positivo(s)");
            System.out.println(negative+" valor(es) negativo(s)");
    }
}
