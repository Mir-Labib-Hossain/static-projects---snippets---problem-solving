package URI_2313;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b <= c || c + b <= a || c + a <= b) {
            System.out.println("Invalido");
        } else {
            if (a == b && b == c) {
                System.out.println("Valido-Equilatero");
            } else if (a == b || b == c || c == a) {
                System.out.println("Valido-Isoceles");
            } else{
                System.out.println("Valido-Escaleno");
            }
            System.out.println("Retangulo: " + (((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))) ? "S" : "N"));
        }
    }
}