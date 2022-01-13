package Militery_Time24_to_Normal_12;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String arr[] = input.split(":");
        int hour = Integer.parseInt(arr[0]);
        int min  = Integer.parseInt(arr[1]);
        int f;
        if(input.charAt(8)=='A')
        {
            arr[1] = arr[2].replace("AM","");
            f=0;
        }
        else
        {
            arr[1] = arr[2].replace("PM","");
            f=1;
        }
        int sec = Integer.parseInt(arr[1]);
        if(f==0)
        {
            if(hour==12)
                hour=00;
        }
        else if(f==1)
        {
            if(hour<12)
                hour+=12;
        }        
        System.out.println(String.format("%02d",hour)+":"+String.format("%02d",min)+":"+String.format("%02d",sec));
    }
}
