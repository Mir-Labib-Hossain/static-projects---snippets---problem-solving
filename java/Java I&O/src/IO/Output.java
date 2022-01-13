package IO;
import java.io.FileOutputStream;
import java.util.Scanner;
public class Output {
public static void main(String[] args) throws Exception{
    Scanner input = new Scanner(System.in);
    FileOutputStream f = new FileOutputStream("G:\\practice\\JAVA\\Java I&O\\text.txt");
    String s = input.nextLine();
    byte a[] = s.getBytes();
    f.write(a);
    f.close();
    }
    
}
