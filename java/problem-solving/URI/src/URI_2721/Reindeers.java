package URI_2721;

import java.util.Scanner;

public class Reindeers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, sum = 0;
        for (i = 0; i < 9; i++) {
            sum += scanner.nextInt();
        }
        while(true) {
            for (i = 0; i < 9; i++) {
                sum--;
                if(sum==0)
                {
                    if(i==0)System.out.println("Dasher");
                    if(i==1)System.out.println("Dancer");
                    if(i==2)System.out.println("Prancer");
                    if(i==3)System.out.println("Vixen");
                    if(i==4)System.out.println("Comet");
                    if(i==5)System.out.println("Cupid");
                    if(i==6)System.out.println("Donner");
                    if(i==7)System.out.println("Blitzen");
                    if(i==8)System.out.println("Rudolph");
                    break;
                }
            }
            if(sum==0)break;
        }
    }
}
