package URI_1061;
import java.util.Scanner;
public class EventTime {
public static void main(String[]args)    
{
    Scanner obj = new Scanner(System.in);
    
     String day = obj.nextLine();
    day =day.replace("Dia ","");
    int day1 = Integer.parseInt(day);
    int hour1 = obj.nextInt();
    char c = obj.next().charAt(0);
    int min1 = obj.nextInt();
    c = obj.next().charAt(0);
    int sec1 = obj.nextInt();
              obj.nextLine();
    day = obj.nextLine();
    day =day.replace("Dia ","");
    int day2 = Integer.parseInt(day);
                
    int hour2 = obj.nextInt();
    c = obj.next().charAt(0);
    int min2 = obj.nextInt();
    c = obj.next().charAt(0);
    int sec2 = obj.nextInt();


       long day1ans = hour1*60*60 + min1*60 + sec1;
       long day2ans = hour2*60*60 + min2*60 + sec2;
       long ans = ((day2-day1)*24*60*60)-day1ans+day2ans;
    long W = ans/86400;
        ans=ans%86400;
        System.out.println(W+" dia(s)");
    long X = ans/3600;
        ans=ans%3600;
        System.out.println(X+" hora(s)");
    long Y = ans/60;
        ans=ans%60;
        System.out.println(Y+" minuto(s)");
    long Z = ans;
        System.out.println(Z+" segundo(s)");    
}
}
