package URI_2950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Towers {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        System.out.printf("%.2f\n",a/(b+c));
    }
}
