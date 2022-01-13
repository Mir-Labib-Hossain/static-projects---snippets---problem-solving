package URI_1914;
import java.util.Scanner;
public class Turn {
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     
     int test = obj.nextInt();
     int num1, num2;
     
     for(int i=0; i<test; i++)
     {    
                      obj.nextLine();
        String name = obj.nextLine();
        String arr[] = name.split(" ");
        
        num1 = obj.nextInt();
        num2 = obj.nextInt();
         
        if((num1+num2)%2 == 0)
        {
            if(arr[1].equals("PAR"))
                System.out.println(arr[0]);
            else
                System.out.println(arr[2]);
        }
        else
        {
            if(arr[1].equals("IMPAR"))
                System.out.println(arr[0]);
            else
                System.out.println(arr[2]);
        }
     }
    }
}
