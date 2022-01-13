package delete_duplicate_element;

import java.util.HashSet;
import java.util.Scanner;

public class DeleteDuplicateElement {

    public static void main(String[] args) {
        HashSet<Integer> arr = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length you will enter :");
        int i, l = scanner.nextInt();

        System.out.println("Enter " + l + " inteager number :");
        for (i = 0; i < l; i++) {
            arr.add(scanner.nextInt());
        }
        for (Integer j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
