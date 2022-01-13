package URI_1021;

import static java.lang.Math.round;
import java.util.Scanner;

public class BanknoteCoins {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double N = s.nextDouble();
        int[] money = {100, 50, 20, 10, 5, 2};
        double[] coin = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};

        double note;
        System.out.println("NOTAS:");
        for (int i = 0; i < money.length; i++) {
            note = N / money[i];
            System.out.println((int) note + " nota(s) de R$ " + money[i] + ".00");
            N = N % money[i];
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < coin.length - 1; i++) {
            note = (double) (N / coin[i]);
            System.out.println((int) note + " moeda(s) de R$ " + String.format("%.2f", coin[i]));
            N = (double) (N % coin[i]);
        }
        note = (double) (N / coin[coin.length - 1]);
        System.out.println(round(note) + " moeda(s) de R$ " + String.format("%.2f", coin[coin.length - 1]));
//     double N = s.nextDouble();
//     
//     int note = (int)N;
//     double coin = N-note;
//     int amount=0;
//     System.out.println("NOTAS:");
//     
//     amount=note/100;
//     note=note%100;
//     System.out.println(amount+" nota(s) de R$ 100.00");
//     
//     amount=note/50;
//     note=note%50;
//     System.out.println(amount+" nota(s) de R$ 50.00");
//     
//     amount=note/20;
//     note=note%20;
//     System.out.println(amount+" nota(s) de R$ 20.00");
//     
//     amount=note/10;
//     note=note%10;
//     System.out.println(amount+" nota(s) de R$ 10.00");
//     
//     amount=note/5;
//     note=note%5;
//     System.out.println(amount+" nota(s) de R$ 5.00");
//     
//     amount=note/2;
//     note=note%2;
//     System.out.println(amount+" nota(s) de R$ 2.00");
//
//     coin=coin+note;
//     System.out.println("MOEDAS:");
//     
//     amount=(int)coin/1;
//     coin=coin%1;
//     System.out.println(amount+" moeda(s) de R$ 1.00");
//     
//     amount=(int)(coin/(.50));
//     coin=coin%.50;
//     System.out.println(amount+" moeda(s) de R$ 0.50");
//     
//     amount=(int)(coin/(.25));
//     coin=coin%.25;
//     System.out.println(amount+" moeda(s) de R$ 0.25");
//     
//     amount=(int)(coin/(.10));
//     coin=coin%.10;
//     System.out.println(amount+" moeda(s) de R$ 0.10");
//     
//     amount=(int)(coin/(.05));
//     coin=coin%.05;
//     System.out.println(amount+" moeda(s) de R$ 0.05");
//     
//     System.out.println(round(coin/(.01))+" moeda(s) de R$ 0.01");
    }
}
