package Date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateForm {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Date d = new SimpleDateFormat("MM dd yyyy").parse(s);
        SimpleDateFormat df = new SimpleDateFormat("E");
        String week = df.format(d);
        switch(week)
        {
            case "Sun":
                System.out.println("SUNDAY");
                break;
            case "Mon":
                    System.out.println("MONDAY");
                break;
            case "Tue":
                System.out.println("TUESDAY");
                break;
            case "Wed":
                System.out.println("WEDNESDAY");
                break;
            case "Thu":
                System.out.println("THURSDAY");
                break;
            case "Fri":
                System.out.println("FRIDAY");
                break;
            case "Sat":
                System.out.println("SATURDAY");
                break;
        }        
    }
}
