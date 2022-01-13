package URI_2717;

import java.util.Scanner;

public class Elf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println((n >= a + b) ? "Farei hoje!" : "Deixa para amanha!");
    }
}
