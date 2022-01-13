package URI_2758;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //URI bug (from form) acepted in C
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        System.out.println("A = " + String.format("%.6f", a) + ", B = " + String.format("% .6f", b) + "\nC = " + String.format("% .6f", c) + ", D = " + String.format("%.6f", d));
        System.out.println("A = " + String.format("%.1f", a) + ", B = " + String.format("%.1f", b) + "\nC = " + String.format("%.1f", c) + ", D = " + String.format("%.1f", d));
        System.out.println("A = " + String.format("%.2f", a) + ", B = " + String.format("%.2f", b) + "\nC = " + String.format("%.2f", c) + ", D = " + String.format("%.2f", d));
        System.out.println("A = " + String.format("%.3f", a) + ", B = " + String.format("%.3f", b) + "\nC = " + String.format("%.3f", c) + ", D = " + String.format("%.3f", d));
        System.out.println("A = " + String.format("%.3E", a) + ", B = " + String.format("%.3E", b) + "\nC = " + String.format("%.3E", c) + ", D = " + String.format("%.3E", d));
        System.out.println("A = " + String.format("%.0f", a) + ", B = " + String.format("%.0f", b) + "\nC = " + String.format("%.0f", c) + ", D = " + String.format("%.0f", d));
    }
}
