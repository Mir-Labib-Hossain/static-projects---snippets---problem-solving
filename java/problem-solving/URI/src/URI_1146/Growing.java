package URI_1146;

import java.util.Scanner;

public class Growing {
    public static void main(String[] args) {
      int X=0;
     int i=0;
    Scanner obj = new Scanner(System.in);
    while(true){
        X = obj.nextInt();
        if(X==0)
            break;
        else{
        System.out.print("1");
        for(i=2; i<=X; i++)
                System.out.print(" "+i);
            System.out.println();
        }
    }     
}
}
