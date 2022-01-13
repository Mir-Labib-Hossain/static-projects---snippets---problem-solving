package min_max;
import java.util.Scanner;
public class LargeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mir Labib Hossain (011183007)\nEnter the length of array : ");
        int length = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;;
        int arr[] = new int[length];
        System.out.print("Enter " + length + " number : ");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
    }
}
