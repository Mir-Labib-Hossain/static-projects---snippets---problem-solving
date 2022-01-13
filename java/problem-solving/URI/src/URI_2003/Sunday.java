package URI_2003;

import java.util.Scanner;

public class Sunday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour;
        int min;
        int ans;

        while (sc.hasNext()) {
            String time = sc.nextLine();
            String arr[] = time.split(":");
            hour = Integer.parseInt(arr[0]);
            min = Integer.parseInt(arr[1]);
            if (hour * 60 + min > 420) {
                System.out.println("Atraso maximo: " + (hour * 60 + min - 7 * 60));
            } else {
                System.out.println("Atraso maximo: 0");
            }
        }
    }
}
