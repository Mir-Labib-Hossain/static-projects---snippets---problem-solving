package URI_1960;
import java.util.Scanner;
public class Main {
    String roman(int num)
    {
        if(num == 1)
            return "I";
        else if(num == 2)
            return "II";
        else if(num == 3)
            return "III";
        else if(num == 4)
            return "IV";
        else if(num == 5)
            return "V";
        else if(num == 6)
            return "VI";
        else if(num == 7)
            return "VII";
        else if(num == 8)
            return "VIII";
        else if(num == 9)
            return "IX";
        else if(num == 10)
            return "X";
        else if(num == 20)
            return "XX";
        else if(num == 30)
            return "XXX";
        else if(num == 40)
            return "XL";
        else if(num == 50)
            return "L";
        else if(num == 60)
            return "LX";
        else if(num == 70)
            return "LXX";
        else if(num == 80)
            return "LXXX";
        else if(num == 90)
            return "XC";
        else if(num == 100)
            return "C";
        else if(num == 200)
            return "CC";
        else if(num == 300)
            return "CCC";
        else if(num == 400)
            return "CD";
        else if(num == 500)
            return "D";
        else if(num == 600)
            return "DC";
        else if(num == 700)
            return "DCC";
        else if(num == 800)
            return "DCCC";
        else if(num == 900)
            return "CM";
        else
            return "";
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Main m = new Main();
        int input = obj.nextInt();
        String input1 = Integer.toString(input);
        int len = input1.length();
        int num1, num2, num3;
        if(len==1)
            System.out.println(m.roman(input));
        else if(len==2)
        {
            System.out.print(m.roman(input-input%10));
            System.out.println(m.roman(input%10));
        }
        else if(len==3)
        {
            System.out.print(m.roman(input-input%100));
            System.out.print(m.roman((input%100)-((input%100)%10)));
            System.out.println(m.roman((input%100)%10));
        }
        
    }
    
}
