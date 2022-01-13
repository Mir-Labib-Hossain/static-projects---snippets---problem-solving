package arrayRemoveDublicateWhileInput;

import java.util.Scanner;

public class RemoveDub {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, temp = 0, r, p;
        r = input.nextInt();
        int arr[] = new int[r];
        for (i = 0; i < r; i++) {
            arr[i] = input.nextInt();
            for (j = 0; j < i; j++) {
                if (i != j && arr[j] == arr[i]) {
                    arr[i] = input.nextInt();
                }
            }
        }
        for (i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
