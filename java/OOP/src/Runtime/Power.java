package Runtime;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.print("'S' for Sutdoen\n'R' for Restart\nEnter your choice : ");
        char choice = input.next().charAt(0);
        if(choice == 'S')
            Runtime.getRuntime().exec("c:\\windows\\System32\\shutdown -s -t 0");
        else if(choice == 'R')
            Runtime.getRuntime().exec("shutdown -r -t 0");
    }
    
}
