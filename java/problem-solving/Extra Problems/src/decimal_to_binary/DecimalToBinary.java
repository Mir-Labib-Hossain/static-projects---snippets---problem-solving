package decimal_to_binary;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
    Scanner labib = new Scanner(System.in);
        System.out.println("asa");
        System.out.print("Inpour Decimal : ");
        int dec = labib.nextInt();
        String bin = "";
        while (dec != 0) {
            bin += dec % 2;
            dec = dec / 2;
        }
        System.out.print("Output Binary : ");
        for (int j = bin.length() - 1; j >= 0; j--) {
            System.out.print(bin.charAt(j));
        }
        System.out.println("");
    }
}
