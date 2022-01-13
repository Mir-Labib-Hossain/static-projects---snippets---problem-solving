package URI_1983;
import java.util.Scanner;
public class Chosen {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    double note;
    int m=0;
    double min=0;
    int ans=0;
    for(int i=0; i<n; i++)
    {
        m=obj.nextInt();
        note = obj.nextDouble();
        if(note>min)
        {
            min=note;
            ans=m;
        }
    }
    if(min<=7.9)
        System.out.println("Minimum note not reached");
    else
        System.out.println(ans);
    }
}
