package URI_1865;
import java.util.Scanner;
public class Mjolnir {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int men = obj.nextInt();
        int i=0;
        String name = null;
        int power=0;
        obj.nextLine();
        for(i=0; i<men; i++)
        {
            name = obj.nextLine();
            String arr[] = name.split(" ");
            name = arr[0];
            power = Integer.parseInt(arr[1]);
            if(name.equals("Thor"))
            System.out.println("Y");
            else
            System.out.println("N");
        }
    }
}
