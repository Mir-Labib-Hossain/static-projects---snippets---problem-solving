package URI_2761;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VariousTypes {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.000000");
        Scanner scanner = new Scanner(System.in);
        
        String arr[] = scanner.nextLine().split(" ");
        int i = Integer.parseInt(arr[0]);
        float f = Float.parseFloat(arr[1]);
        char c = arr[2].charAt(0);
        
        String s="";
        for(int j=3; j<arr.length; j++)
            s+=arr[j]+" ";
        s = s.trim();
        
        f=Float.parseFloat(df.format(f));
         System.out.printf("%s%s%s%s\n", i, f, c, s);
        System.out.println(i + "\t" + f + "\t" + c + "\t" + s);
        System.out.printf("%10s%10s%10s%10s\n", i, f, c, s);
    }
}
