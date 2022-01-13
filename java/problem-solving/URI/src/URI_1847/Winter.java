package URI_1847;
import java.util.Scanner;
public class Winter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        byte day1 = obj.nextByte();
        byte day2 = obj.nextByte();
        byte day3 = obj.nextByte();
             if((day1>day2 && day2<=day3) || (day1<day2 && day2<day3 && ((day2-day1)<=(day3-day2))) || (day1>day2 && day2>day3 && ((day1-day2)>(day2-day3))))
            System.out.println(":)");
        else if((day1<day2 && day2>=day3) || (day1<day2 && day2<day3 && ((day2-day1)>(day3-day2))) || (day1>day2 && day2>day3 && ((day1-day2)<=(day2-day3))))
            System.out.println(":(");
        else if(day1==day2)
            if(day2<day3)
                System.out.println(":)");
            else
                System.out.println(":(");
    } 
}
