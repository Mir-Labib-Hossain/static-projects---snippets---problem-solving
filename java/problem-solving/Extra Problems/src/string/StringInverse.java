package string;
import java.util.Scanner;
public class StringInverse {
public static void main(String[] args) {
    Scanner a= new  Scanner(System.in);
    System.out.print("Enter a String of \nChar type or Integer type : ");
    String b=a.nextLine();
    String c="";
    for(int i=b.length()-1 ;i>=0 ;i--)
    {
        c+= b.charAt(i);
    }
    System.out.print(c);
}
}
