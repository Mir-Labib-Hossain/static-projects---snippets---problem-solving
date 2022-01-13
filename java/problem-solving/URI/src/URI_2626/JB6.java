package URI_2626;
import java.util.Scanner;
public class JB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            int a=0, b=0, c=0;
            String arr[] = s.split(" ");
            if(arr[0].equals("pedra") && arr[1].equals("tesoura"))
                a++;
            if(arr[0].equals("papel") && arr[1].equals("pedra"))
                a++;
            if(arr[0].equals("tesoura") && arr[1].equals("papel"))
                a++;
            if(arr[0].equals("pedra") && arr[2].equals("tesoura"))
                a++;
            if(arr[0].equals("papel") && arr[2].equals("pedra"))
                a++;
            if(arr[0].equals("tesoura") && arr[2].equals("papel"))
                a++;
            if(arr[1].equals("pedra") && arr[0].equals("tesoura"))
                b++;
            if(arr[1].equals("papel") && arr[0].equals("pedra"))
                b++;
            if(arr[1].equals("tesoura") && arr[0].equals("papel"))
                b++;
            if(arr[1].equals("pedra") && arr[2].equals("tesoura"))
                b++;
            if(arr[1].equals("papel") && arr[2].equals("pedra"))
                b++;
            if(arr[1].equals("tesoura") && arr[2].equals("papel"))
                b++;
            if(arr[2].equals("pedra") && arr[1].equals("tesoura"))
                c++;
            if(arr[2].equals("papel") && arr[1].equals("pedra"))
                c++;
            if(arr[2].equals("tesoura") && arr[1].equals("papel"))
                c++;
            if(arr[2].equals("pedra") && arr[0].equals("tesoura"))
                c++;
            if(arr[2].equals("papel") && arr[0].equals("pedra"))
                c++;
            if(arr[2].equals("tesoura") && arr[0].equals("papel"))
                c++;
            if(a>b && a>c)
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            else if(b>a && b>c)
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
            else if(c>a && c>b)
                System.out.println("Urano perdeu algo muito precioso...");
            else if(a==b || b==c || a==c)
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
        }
    }
}
