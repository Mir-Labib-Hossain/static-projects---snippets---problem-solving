package URI_2060;
import java.util.Scanner;
public class Bino {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);    
    int n = sc.nextInt();
    int arr[] =  new int[n];
    int i;
    int two=0, three=0, four=0, five=0;
    for(i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
        if(arr[i]%2==0)
            two++;
        if(arr[i]%3==0)
            three++;
        if(arr[i]%4==0)
            four++;
        if(arr[i]%5==0)
            five++;
    }
        System.out.println(two+" Multiplo(s) de 2");
        System.out.println(three+" Multiplo(s) de 3");
        System.out.println(four+" Multiplo(s) de 4");
        System.out.println(five+" Multiplo(s) de 5");
  }
}