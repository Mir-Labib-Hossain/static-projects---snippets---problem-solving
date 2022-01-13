package IO;
import java.util.Scanner;
import java.io.FileInputStream;
public class Input {
    public static void main(String[] args) throws Exception{
        FileInputStream f = new FileInputStream("G:\\practice\\JAVA\\Java I&O\\text.txt");
        int i=0;
        while((i=f.read())!=-1)System.out.print((char)i);
    }
}   
