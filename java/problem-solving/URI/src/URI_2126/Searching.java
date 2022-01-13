package URI_2126;
import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1;
        String input2;
        String tem="";
        int i, j, c=0,cs =1;
        int l1, l2;
        int pos;
        while(sc.hasNextLine())
        {
            input1 = sc.nextLine();
            input2 = sc.nextLine();
            pos = (input2.lastIndexOf(input1)+1);
            l1 = input1.length();
            l2 = input2.length();
            for(i=0; i<l2-l1+1; i++)
            {
                for(j=0; j<l1; j++)
                    tem += input2.charAt(i+j);
                if(tem.equals(input1))
                    c++;
                tem="";
            }
            System.out.println("Caso #"+cs+":");
            if(c==0)
                System.out.println("Nao existe subsequencia");
            else{
                System.out.println("Qtd.Subsequencias: "+c);
                System.out.println("Pos: "+pos);
            }
            System.out.println("");
            c=0;
            cs++;
        }
    }
}