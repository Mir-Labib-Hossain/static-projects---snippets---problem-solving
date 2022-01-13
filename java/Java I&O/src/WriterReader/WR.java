package WriterReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WR {
    public static void main(String[] args) throws Exception {
        String s = "G:\\Works\\JAVA\\Java I&O\\text.txt";
    Writer w = new FileWriter(s);
    BufferedWriter bw = new BufferedWriter(w);
    String in = "LABIB";
    bw.write(in);
    bw.close();
    Reader r = new FileReader(s);
    BufferedReader br = new BufferedReader(r);
    int i=0;
    while((i=br.read())!=-1)
            System.out.print((char)i);
    }
    
}
