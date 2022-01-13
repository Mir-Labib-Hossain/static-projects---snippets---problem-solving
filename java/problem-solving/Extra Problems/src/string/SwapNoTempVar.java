package string;

import java.util.Scanner;
public class SwapNoTempVar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st string : ");
        String str1 = obj.nextLine();
        System.out.println("Enter 2nd String : ");
        String str2 = obj.nextLine();
        
        str1 += str2;
        str2 = str1 + str2;
        
        str1 = str2.substring( str1.length(), str2.length() );
        System.out.println(str1);
        
        str2 = str2.substring(0, str2.length() - (str1.length()*2) );
        System.out.println(str2);
    }
}
