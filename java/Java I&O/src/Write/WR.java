package Write;
import java.util.Scanner;
import java.io.*;
public class WR {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        File f = new File("G:\\Works\\JAVA\\Java I&O\\text.txt");
        if(f.createNewFile())
            System.out.println("New File created");
        else
            System.out.println("File found !");
        Writer w = new FileWriter("G:\\Works\\JAVA\\Java I&O\\text.txt");
        BufferedWriter b = new BufferedWriter(w);
        System.out.println("Enter input here : ");
        String s = input.nextLine();
        b.write(s);
       // b.close();
        Reader r = new FileReader("G:\\Works\\JAVA\\Java I&O\\text.txt");
        BufferedReader br = new BufferedReader(r);
        int i=0;
        while((i=br.read())!=-1)
        {
            System.out.print((char)i);
        }
        
    }
    
}
