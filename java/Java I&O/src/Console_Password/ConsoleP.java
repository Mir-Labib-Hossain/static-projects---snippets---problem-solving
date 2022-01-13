package Console_Password;
import java.io.Console;
public class ConsoleP {
    public static void main(String[] args) {
        System.out.println("Enter password: ");    
        char[] ch=System.console().readPassword();    
        String pass=String.valueOf(ch);//rins in command line
        System.out.println("Password is: "+pass);
    }
}