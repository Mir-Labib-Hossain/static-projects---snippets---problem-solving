package pattern;
import java.util.Scanner;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner labib = new Scanner (System.in);
        System.out.println("Enter row Size : ");
        int l =labib.nextInt();
        int k=1;
for(int i=1; i<=l; i++)
{
    for(int j=1; j<=i; j++)
    {
        
        System.out.print(i*j+"  ");
        
        k++;
    }
    System.out.println("");
}
}
}