package URI_1018;

import java.util.Scanner;

public class Banknotes {
    public static void main(String [] args){
        
    Scanner s = new Scanner(System.in);
    
        int N = s.nextInt();
        int[] arr = {100, 50, 20, 10, 5,2,1};
        int note;
        
        System.out.println(N);
        
        for(int i=0; i<arr.length; i++)
        {
            note = N / arr[i];
            System.out.println(note+" nota(s) de R$ "+arr[i]+",00");
            N = N % arr[i];
        }
//    int N = s.nextInt();
//
//    System.out.println(N);
//    int note = 0;
//
//    note = N / 100;
//    N = N % 100;
//    System.out.println(note+" nota(s) de R$ 100,00");
//
//    note = N / 50;
//    N = N % 50;
//    System.out.println(note+" nota(s) de R$ 50,00");
//
//    note = N / 20;
//    N = N % 20;
//    System.out.println(note+" nota(s) de R$ 20,00");
//
//    note = N / 10;
//    N = N % 10;
//    System.out.println(note+" nota(s) de R$ 10,00");
//
//    note = N / 5;
//    N = N % 5;
//    System.out.println(note+" nota(s) de R$ 5,00");
//
//    note = N / 2;
//    N = N % 2;
//    System.out.println(note+" nota(s) de R$ 2,00");
//
//    note = N / 1;
//    System.out.println(note+" nota(s) de R$ 1,00");
   }
}