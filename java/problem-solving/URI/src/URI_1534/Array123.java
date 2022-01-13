package URI_1534;
import java.util.Scanner;
public class Array123 {
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in); 
     byte N=0;
     byte i=0, j=0;
     while(obj.hasNext()){
         N = obj.nextByte();
             for(i=1; i<=N; i++)
             {
                 for(j=1; j<=N; j++)
                 {
                     if(i+j-1==N)
                         System.out.print("2");
                     else if(i==j)
                         System.out.print("1");
                     else
                         System.out.print("3");
                 }
                 System.out.println();
             }
         }
    }   
}
