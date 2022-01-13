package SequenceIO;
import java.io.*;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) throws Exception{
        Scanner obj = new Scanner(System.in);
        FileOutputStream o1 = new FileOutputStream("G:\\practice\\JAVA\\Java I&O\\text1.txt");
        FileOutputStream o2 = new FileOutputStream("G:\\practice\\JAVA\\Java I&O\\text2.txt");
        String s1 = obj.nextLine();
        o1.write(s1.getBytes());
        String s2 = "2nd text from here";
        o2.write(s2.getBytes());
        FileInputStream i1 = new FileInputStream("G:\\practice\\JAVA\\Java I&O\\text1.txt");
        FileInputStream i2 = new FileInputStream("G:\\practice\\JAVA\\Java I&O\\text2.txt");
        SequenceInputStream s = new SequenceInputStream(i1, i2);
        int i=0;
        while((i=s.read())!=-1)
            System.out.print((char)i);

    }
}
